package com.heroxin.web.controller.student;

/*
    @Author Heroxin
    
    @Create 2023-12-29-16:44

    @Description:
*/

import com.heroxin.common.core.controller.BaseController;
import com.heroxin.common.core.domain.AjaxResult;
import com.heroxin.common.core.page.TableDataInfo;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.system.domain.SysStudent;
import com.heroxin.system.service.ISysStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "学生中心")
@RestController
@RequestMapping("/system/student")
public class StudentController extends BaseController {

    @Autowired
    private ISysStudentService sysStudentService;

    /**
     * 查询学生信息列表
     */
    @ApiOperation("查询学生信息列表")
    @GetMapping("/list")
    public TableDataInfo list(SysStudent sysStudent)
    {
        startPage();
        List<SysStudent> list = sysStudentService.queryList(sysStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生信息列表
     */
    @ApiOperation("导出学生信息列表")
    @GetMapping("/export")
    public AjaxResult export(SysStudent sysStudent)
    {
        List<SysStudent> list = sysStudentService.queryList(sysStudent);
        ExcelUtil<SysStudent> util = new ExcelUtil<SysStudent>(SysStudent.class);
        return util.exportExcel(list, "student");
    }

    /**
     * 获取学生信息详细信息
     */
    @ApiOperation("获取学生信息详细信息")
    @GetMapping(value = "/{studentId}")
    public AjaxResult getInfo(@PathVariable("studentId") Long studentId)
    {
        return AjaxResult.success(sysStudentService.getById(studentId));
    }

    /**
     * 新增学生信息
     */
    @ApiOperation("新增学生信息")
    @PostMapping
    public AjaxResult add(@RequestBody SysStudent sysStudent)
    {
        return toAjax(sysStudentService.save(sysStudent));
    }

    /**
     * 修改学生信息
     */
    @ApiOperation("修改学生信息")
    @PutMapping
    public AjaxResult edit(@RequestBody SysStudent sysStudent)
    {
        return toAjax(sysStudentService.updateById(sysStudent));
    }

    /**
     * 删除学生信息
     */
    @ApiOperation("删除学生信息")
    @DeleteMapping("/{studentIds}")
    public AjaxResult remove(@PathVariable Long[] studentIds)
    {
        return toAjax(sysStudentService.removeByIds(Arrays.asList(studentIds)));
    }
}