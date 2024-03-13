package com.heroxin.web.controller.internship;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.system.domain.internship.InternshipStudent;
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
import com.heroxin.system.service.IInternshipStudentService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 实习生信息Controller
 *
 * @author heroxin
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/internship/student")
public class InternshipStudentController extends BaseController {
    @Autowired
    private IInternshipStudentService internshipStudentService;

    @GetMapping("/lixin")
    public String hello() {
        return "hello lixin";
    }

    /**
     * 查询实习生信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:student:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipStudent internshipStudent) {
        startPage();
        List<InternshipStudent> list = internshipStudentService.selectInternshipStudentList(internshipStudent);
        return getDataTable(list);
    }

    /**
     * 导出实习生信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:student:export')")
    @Log(title = "实习生信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipStudent internshipStudent) {
        List<InternshipStudent> list = internshipStudentService.selectInternshipStudentList(internshipStudent);
        ExcelUtil<InternshipStudent> util = new ExcelUtil<InternshipStudent>(InternshipStudent.class);
        util.exportExcel(response, list, "实习生信息数据");
    }

    /**
     * 获取实习生信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(internshipStudentService.selectInternshipStudentById(id));
    }

    /**
     * 新增实习生信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:add')")
    @Log(title = "实习生信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipStudent internshipStudent) {
        return toAjax(internshipStudentService.insertInternshipStudent(internshipStudent));
    }

    /**
     * 修改实习生信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:edit')")
    @Log(title = "实习生信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipStudent internshipStudent) {
        return toAjax(internshipStudentService.updateInternshipStudent(internshipStudent));
    }

    /**
     * 删除实习生信息
     */
    @PreAuthorize("@ss.hasPermi('system:student:remove')")
    @Log(title = "实习生信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(internshipStudentService.deleteInternshipStudentByIds(ids));
    }
}
