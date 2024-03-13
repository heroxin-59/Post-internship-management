package com.heroxin.web.controller.internship;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.system.domain.internship.InternshipSummary;
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
import com.heroxin.system.service.IInternshipSummaryService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 实习总结信息Controller
 *
 * @author heroxin
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/internship/summary")
public class InternshipSummaryController extends BaseController {
    @Autowired
    private IInternshipSummaryService internshipSummaryService;

    @GetMapping("/lixin")
    public String hello() {
        return "hello lixin";
    }

    /**
     * 查询实习总结信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:summary:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipSummary internshipSummary) {
        startPage();
        List<InternshipSummary> list = internshipSummaryService.selectInternshipSummaryList(internshipSummary);
        return getDataTable(list);
    }

    /**
     * 导出实习总结信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:summary:export')")
    @Log(title = "实习总结信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipSummary internshipSummary) {
        List<InternshipSummary> list = internshipSummaryService.selectInternshipSummaryList(internshipSummary);
        ExcelUtil<InternshipSummary> util = new ExcelUtil<InternshipSummary>(InternshipSummary.class);
        util.exportExcel(response, list, "实习总结信息数据");
    }

    /**
     * 获取实习总结信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:summary:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(internshipSummaryService.selectInternshipSummaryById(id));
    }

    /**
     * 新增实习总结信息
     */
    @PreAuthorize("@ss.hasPermi('system:summary:add')")
    @Log(title = "实习总结信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipSummary internshipSummary) {
        return toAjax(internshipSummaryService.insertInternshipSummary(internshipSummary));
    }

    /**
     * 修改实习总结信息
     */
    @PreAuthorize("@ss.hasPermi('system:summary:edit')")
    @Log(title = "实习总结信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipSummary internshipSummary) {
        return toAjax(internshipSummaryService.updateInternshipSummary(internshipSummary));
    }

    /**
     * 删除实习总结信息
     */
    @PreAuthorize("@ss.hasPermi('system:summary:remove')")
    @Log(title = "实习总结信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(internshipSummaryService.deleteInternshipSummaryByIds(ids));
    }
}
