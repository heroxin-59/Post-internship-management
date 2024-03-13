package com.heroxin.web.controller.internship;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.system.domain.internship.InternshipInformation;
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
import com.heroxin.system.service.IInternshipInformationService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 实习信息发布Controller
 *
 * @author heroxin
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/internship/information")
public class InternshipInformationController extends BaseController {
    @Autowired
    private IInternshipInformationService internshipInformationService;

    @GetMapping("/lixin")
    public String hello() {
        return "hello lixin";
    }

    /**
     * 查询实习信息发布列表
     */
    @PreAuthorize("@ss.hasPermi('system:information:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipInformation internshipInformation) {
        startPage();
        List<InternshipInformation> list = internshipInformationService.selectInternshipInformationList(internshipInformation);
        return getDataTable(list);
    }

    /**
     * 导出实习信息发布列表
     */
    @PreAuthorize("@ss.hasPermi('system:information:export')")
    @Log(title = "实习信息发布", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipInformation internshipInformation) {
        List<InternshipInformation> list = internshipInformationService.selectInternshipInformationList(internshipInformation);
        ExcelUtil<InternshipInformation> util = new ExcelUtil<InternshipInformation>(InternshipInformation.class);
        util.exportExcel(response, list, "实习信息发布数据");
    }

    /**
     * 获取实习信息发布详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:information:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(internshipInformationService.selectInternshipInformationById(id));
    }

    /**
     * 新增实习信息发布
     */
    @PreAuthorize("@ss.hasPermi('system:information:add')")
    @Log(title = "实习信息发布", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipInformation internshipInformation) {
        return toAjax(internshipInformationService.insertInternshipInformation(internshipInformation));
    }

    /**
     * 修改实习信息发布
     */
    @PreAuthorize("@ss.hasPermi('system:information:edit')")
    @Log(title = "实习信息发布", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipInformation internshipInformation) {
        return toAjax(internshipInformationService.updateInternshipInformation(internshipInformation));
    }

    /**
     * 删除实习信息发布
     */
    @PreAuthorize("@ss.hasPermi('system:information:remove')")
    @Log(title = "实习信息发布", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(internshipInformationService.deleteInternshipInformationByIds(ids));
    }
}
