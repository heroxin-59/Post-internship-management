package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipSummary;
import com.heroxin.system.mapper.internship.InternshipSummaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipSummaryService;

/**
 * 实习总结信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipSummaryServiceImpl implements IInternshipSummaryService 
{
    @Autowired
    private InternshipSummaryMapper internshipSummaryMapper;

    /**
     * 查询实习总结信息
     * 
     * @param id 实习总结信息主键
     * @return 实习总结信息
     */
    @Override
    public InternshipSummary selectInternshipSummaryById(Long id)
    {
        return internshipSummaryMapper.selectInternshipSummaryById(id);
    }

    /**
     * 查询实习总结信息列表
     * 
     * @param internshipSummary 实习总结信息
     * @return 实习总结信息
     */
    @Override
    public List<InternshipSummary> selectInternshipSummaryList(InternshipSummary internshipSummary)
    {
        return internshipSummaryMapper.selectInternshipSummaryList(internshipSummary);
    }

    /**
     * 新增实习总结信息
     * 
     * @param internshipSummary 实习总结信息
     * @return 结果
     */
    @Override
    public int insertInternshipSummary(InternshipSummary internshipSummary)
    {
        return internshipSummaryMapper.insertInternshipSummary(internshipSummary);
    }

    /**
     * 修改实习总结信息
     * 
     * @param internshipSummary 实习总结信息
     * @return 结果
     */
    @Override
    public int updateInternshipSummary(InternshipSummary internshipSummary)
    {
        return internshipSummaryMapper.updateInternshipSummary(internshipSummary);
    }

    /**
     * 批量删除实习总结信息
     * 
     * @param ids 需要删除的实习总结信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipSummaryByIds(Long[] ids)
    {
        return internshipSummaryMapper.deleteInternshipSummaryByIds(ids);
    }

    /**
     * 删除实习总结信息信息
     * 
     * @param id 实习总结信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipSummaryById(Long id)
    {
        return internshipSummaryMapper.deleteInternshipSummaryById(id);
    }
}
