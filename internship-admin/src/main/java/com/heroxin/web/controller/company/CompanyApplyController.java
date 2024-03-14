package com.heroxin.web.controller.company;

import com.heroxin.common.annotation.Log;
import com.heroxin.common.core.controller.BaseController;
import com.heroxin.common.core.domain.AjaxResult;
import com.heroxin.common.core.page.TableDataInfo;
import com.heroxin.common.enums.BusinessType;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.internship.domain.InternshipApply;
import com.heroxin.internship.service.IInternshipApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 实习申请审核信息Controller
 *
 * @author heroxin
 * @date 2024-03-14
 */
@RestController
@RequestMapping("/company/apply")
public class CompanyApplyController extends BaseController {
    @Autowired
    private IInternshipApplyService internshipApplyService;

    /**
     * 查询实习申请审核信息列表
     */
    @PreAuthorize("@ss.hasPermi('company:apply:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipApply internshipApply) {
        startPage();
        List<InternshipApply> list = internshipApplyService.selectInternshipApplyList(internshipApply);
        return getDataTable(list);
    }

    /**
     * 导出实习申请审核信息列表
     */
    @PreAuthorize("@ss.hasPermi('company:apply:export')")
    @Log(title = "实习申请审核信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipApply internshipApply) {
        List<InternshipApply> list = internshipApplyService.selectInternshipApplyList(internshipApply);
        ExcelUtil<InternshipApply> util = new ExcelUtil<InternshipApply>(InternshipApply.class);
        util.exportExcel(response, list, "实习申请审核信息数据");
    }

    /**
     * 获取实习申请审核信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('company:apply:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(internshipApplyService.selectInternshipApplyById(id));
    }

    /**
     * 新增实习申请审核信息
     */
    @PreAuthorize("@ss.hasPermi('company:apply:add')")
    @Log(title = "实习申请审核信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipApply internshipApply) {
        return toAjax(internshipApplyService.insertInternshipApply(internshipApply));
    }

    /**
     * 修改实习申请审核信息
     */
    @PreAuthorize("@ss.hasPermi('company:apply:edit')")
    @Log(title = "实习申请审核信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipApply internshipApply) {
        return toAjax(internshipApplyService.updateInternshipApply(internshipApply));
    }

    /**
     * 删除实习申请审核信息
     */
    @PreAuthorize("@ss.hasPermi('company:apply:remove')")
    @Log(title = "实习申请审核信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(internshipApplyService.deleteInternshipApplyByIds(ids));
    }
}
