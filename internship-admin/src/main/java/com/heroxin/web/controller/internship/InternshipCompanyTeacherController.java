package com.heroxin.web.controller.internship;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.system.domain.internship.InternshipCompanyTeacher;
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
import com.heroxin.system.service.IInternshipCompanyTeacherService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 企业讲师信息Controller
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/internship/company/teacher")
public class InternshipCompanyTeacherController extends BaseController
{
    @Autowired
    private IInternshipCompanyTeacherService internshipCompanyTeacherService;

    @GetMapping("/lixin")
    public String hello(){
        return "hello lixin";
    }
    /**
     * 查询企业讲师信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipCompanyTeacher internshipCompanyTeacher)
    {
        startPage();
        List<InternshipCompanyTeacher> list = internshipCompanyTeacherService.selectInternshipCompanyTeacherList(internshipCompanyTeacher);
        return getDataTable(list);
    }

    /**
     * 导出企业讲师信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:export')")
    @Log(title = "企业讲师信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipCompanyTeacher internshipCompanyTeacher)
    {
        List<InternshipCompanyTeacher> list = internshipCompanyTeacherService.selectInternshipCompanyTeacherList(internshipCompanyTeacher);
        ExcelUtil<InternshipCompanyTeacher> util = new ExcelUtil<InternshipCompanyTeacher>(InternshipCompanyTeacher.class);
        util.exportExcel(response, list, "企业讲师信息数据");
    }

    /**
     * 获取企业讲师信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(internshipCompanyTeacherService.selectInternshipCompanyTeacherById(id));
    }

    /**
     * 新增企业讲师信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:add')")
    @Log(title = "企业讲师信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipCompanyTeacher internshipCompanyTeacher)
    {
        return toAjax(internshipCompanyTeacherService.insertInternshipCompanyTeacher(internshipCompanyTeacher));
    }

    /**
     * 修改企业讲师信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:edit')")
    @Log(title = "企业讲师信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipCompanyTeacher internshipCompanyTeacher)
    {
        return toAjax(internshipCompanyTeacherService.updateInternshipCompanyTeacher(internshipCompanyTeacher));
    }

    /**
     * 删除企业讲师信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:remove')")
    @Log(title = "企业讲师信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(internshipCompanyTeacherService.deleteInternshipCompanyTeacherByIds(ids));
    }
}
