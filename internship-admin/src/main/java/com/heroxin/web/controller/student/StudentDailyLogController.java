package com.heroxin.web.controller.student;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.common.utils.SecurityUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.heroxin.common.annotation.Log;
import com.heroxin.common.core.controller.BaseController;
import com.heroxin.common.core.domain.AjaxResult;
import com.heroxin.common.enums.BusinessType;
import com.heroxin.internship.domain.InternshipDailyLog;
import com.heroxin.internship.service.IInternshipDailyLogService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 实习日志信息Controller
 *
 * @author heroxin
 * @date 2024-03-14
 */
@RestController
@RequestMapping("/student/log")
public class StudentDailyLogController extends BaseController {
    @Autowired
    private IInternshipDailyLogService internshipDailyLogService;

    /**
     * 查询实习日志信息列表
     */
    @PreAuthorize("@ss.hasPermi('student:log:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipDailyLog internshipDailyLog) {
        startPage();
        if (!"admin".equals(SecurityUtils.getUsername())) {
            internshipDailyLog.setStudent(SecurityUtils.getUsername());
        }
        List<InternshipDailyLog> list = internshipDailyLogService.selectInternshipDailyLogList(internshipDailyLog);
        return getDataTable(list);
    }

    /**
     * 导出实习日志信息列表
     */
    @PreAuthorize("@ss.hasPermi('student:log:export')")
    @Log(title = "实习日志信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipDailyLog internshipDailyLog) {
        List<InternshipDailyLog> list = internshipDailyLogService.selectInternshipDailyLogList(internshipDailyLog);
        ExcelUtil<InternshipDailyLog> util = new ExcelUtil<InternshipDailyLog>(InternshipDailyLog.class);
        util.exportExcel(response, list, "实习日志信息数据");
    }

    /**
     * 获取实习日志信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('student:log:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(internshipDailyLogService.selectInternshipDailyLogById(id));
    }

    /**
     * 新增实习日志信息
     */
    @PreAuthorize("@ss.hasPermi('student:log:add')")
    @Log(title = "实习日志信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipDailyLog internshipDailyLog) {
        return toAjax(internshipDailyLogService.insertInternshipDailyLog(internshipDailyLog));
    }

    /**
     * 修改实习日志信息
     */
    @PreAuthorize("@ss.hasPermi('student:log:edit')")
    @Log(title = "实习日志信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipDailyLog internshipDailyLog) {
        return toAjax(internshipDailyLogService.updateInternshipDailyLog(internshipDailyLog));
    }

    /**
     * 删除实习日志信息
     */
    @PreAuthorize("@ss.hasPermi('student:log:remove')")
    @Log(title = "实习日志信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(internshipDailyLogService.deleteInternshipDailyLogByIds(ids));
    }
}
