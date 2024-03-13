package com.heroxin.web.controller.internship;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.system.domain.internship.InternshipTeacher;
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
import com.heroxin.system.service.IInternshipTeacherService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 指导教师信息Controller
 *
 * @author heroxin
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/internship/teachers")
public class InternshipTeacherController extends BaseController {
    @Autowired
    private IInternshipTeacherService internshipTeacherService;

    @GetMapping("/lixin")
    public String hello() {
        return "hello lixin";
    }

    /**
     * 查询指导教师信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipTeacher internshipTeacher) {
        startPage();
        List<InternshipTeacher> list = internshipTeacherService.selectInternshipTeacherList(internshipTeacher);
        return getDataTable(list);
    }

    /**
     * 导出指导教师信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:export')")
    @Log(title = "指导教师信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipTeacher internshipTeacher) {
        List<InternshipTeacher> list = internshipTeacherService.selectInternshipTeacherList(internshipTeacher);
        ExcelUtil<InternshipTeacher> util = new ExcelUtil<InternshipTeacher>(InternshipTeacher.class);
        util.exportExcel(response, list, "指导教师信息数据");
    }

    /**
     * 获取指导教师信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(internshipTeacherService.selectInternshipTeacherById(id));
    }

    /**
     * 新增指导教师信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:add')")
    @Log(title = "指导教师信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipTeacher internshipTeacher) {
        return toAjax(internshipTeacherService.insertInternshipTeacher(internshipTeacher));
    }

    /**
     * 修改指导教师信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:edit')")
    @Log(title = "指导教师信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipTeacher internshipTeacher) {
        return toAjax(internshipTeacherService.updateInternshipTeacher(internshipTeacher));
    }

    /**
     * 删除指导教师信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:remove')")
    @Log(title = "指导教师信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(internshipTeacherService.deleteInternshipTeacherByIds(ids));
    }
}
