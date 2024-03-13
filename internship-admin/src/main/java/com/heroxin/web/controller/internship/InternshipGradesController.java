package com.heroxin.web.controller.internship;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.system.domain.internship.InternshipGrades;
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
import com.heroxin.system.service.IInternshipGradesService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 实习成绩信息Controller
 *
 * @author heroxin
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/internship/grades")
public class InternshipGradesController extends BaseController {
    @Autowired
    private IInternshipGradesService internshipGradesService;

    @GetMapping("/lixin")
    public String hello() {
        return "hello lixin";
    }

    /**
     * 查询实习成绩信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:grades:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipGrades internshipGrades) {
        startPage();
        List<InternshipGrades> list = internshipGradesService.selectInternshipGradesList(internshipGrades);
        return getDataTable(list);
    }

    /**
     * 导出实习成绩信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:grades:export')")
    @Log(title = "实习成绩信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipGrades internshipGrades) {
        List<InternshipGrades> list = internshipGradesService.selectInternshipGradesList(internshipGrades);
        ExcelUtil<InternshipGrades> util = new ExcelUtil<InternshipGrades>(InternshipGrades.class);
        util.exportExcel(response, list, "实习成绩信息数据");
    }

    /**
     * 获取实习成绩信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:grades:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(internshipGradesService.selectInternshipGradesById(id));
    }

    /**
     * 新增实习成绩信息
     */
    @PreAuthorize("@ss.hasPermi('system:grades:add')")
    @Log(title = "实习成绩信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipGrades internshipGrades) {
        return toAjax(internshipGradesService.insertInternshipGrades(internshipGrades));
    }

    /**
     * 修改实习成绩信息
     */
    @PreAuthorize("@ss.hasPermi('system:grades:edit')")
    @Log(title = "实习成绩信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipGrades internshipGrades) {
        return toAjax(internshipGradesService.updateInternshipGrades(internshipGrades));
    }

    /**
     * 删除实习成绩信息
     */
    @PreAuthorize("@ss.hasPermi('system:grades:remove')")
    @Log(title = "实习成绩信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(internshipGradesService.deleteInternshipGradesByIds(ids));
    }
}
