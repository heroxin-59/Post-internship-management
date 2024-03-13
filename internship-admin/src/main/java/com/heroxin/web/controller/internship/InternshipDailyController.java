package com.heroxin.web.controller.internship;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.heroxin.system.domain.internship.InternshipDaily;
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
import com.heroxin.system.service.IInternshipDailyService;
import com.heroxin.common.utils.poi.ExcelUtil;
import com.heroxin.common.core.page.TableDataInfo;

/**
 * 实习考勤信息Controller
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@RestController
@RequestMapping("/internship/daily")
public class InternshipDailyController extends BaseController
{
    @Autowired
    private IInternshipDailyService internshipDailyService;
    @GetMapping("/lixin")
    public String hello(){
        return "hello lixin";
    }
    /**
     * 查询实习考勤信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:daily:list')")
    @GetMapping("/list")
    public TableDataInfo list(InternshipDaily internshipDaily)
    {
        startPage();
        List<InternshipDaily> list = internshipDailyService.selectInternshipDailyList(internshipDaily);
        return getDataTable(list);
    }

    /**
     * 导出实习考勤信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:daily:export')")
    @Log(title = "实习考勤信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InternshipDaily internshipDaily)
    {
        List<InternshipDaily> list = internshipDailyService.selectInternshipDailyList(internshipDaily);
        ExcelUtil<InternshipDaily> util = new ExcelUtil<InternshipDaily>(InternshipDaily.class);
        util.exportExcel(response, list, "实习考勤信息数据");
    }

    /**
     * 获取实习考勤信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:daily:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(internshipDailyService.selectInternshipDailyById(id));
    }

    /**
     * 新增实习考勤信息
     */
    @PreAuthorize("@ss.hasPermi('system:daily:add')")
    @Log(title = "实习考勤信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InternshipDaily internshipDaily)
    {
        return toAjax(internshipDailyService.insertInternshipDaily(internshipDaily));
    }

    /**
     * 修改实习考勤信息
     */
    @PreAuthorize("@ss.hasPermi('system:daily:edit')")
    @Log(title = "实习考勤信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InternshipDaily internshipDaily)
    {
        return toAjax(internshipDailyService.updateInternshipDaily(internshipDaily));
    }

    /**
     * 删除实习考勤信息
     */
    @PreAuthorize("@ss.hasPermi('system:daily:remove')")
    @Log(title = "实习考勤信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(internshipDailyService.deleteInternshipDailyByIds(ids));
    }
}
