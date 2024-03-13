package com.heroxin.system.service;

import com.heroxin.system.domain.internship.InternshipSummary;

import java.util.List;

/**
 * 实习总结信息Service接口
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public interface IInternshipSummaryService 
{
    /**
     * 查询实习总结信息
     * 
     * @param id 实习总结信息主键
     * @return 实习总结信息
     */
    public InternshipSummary selectInternshipSummaryById(Long id);

    /**
     * 查询实习总结信息列表
     * 
     * @param internshipSummary 实习总结信息
     * @return 实习总结信息集合
     */
    public List<InternshipSummary> selectInternshipSummaryList(InternshipSummary internshipSummary);

    /**
     * 新增实习总结信息
     * 
     * @param internshipSummary 实习总结信息
     * @return 结果
     */
    public int insertInternshipSummary(InternshipSummary internshipSummary);

    /**
     * 修改实习总结信息
     * 
     * @param internshipSummary 实习总结信息
     * @return 结果
     */
    public int updateInternshipSummary(InternshipSummary internshipSummary);

    /**
     * 批量删除实习总结信息
     * 
     * @param ids 需要删除的实习总结信息主键集合
     * @return 结果
     */
    public int deleteInternshipSummaryByIds(Long[] ids);

    /**
     * 删除实习总结信息信息
     * 
     * @param id 实习总结信息主键
     * @return 结果
     */
    public int deleteInternshipSummaryById(Long id);
}
