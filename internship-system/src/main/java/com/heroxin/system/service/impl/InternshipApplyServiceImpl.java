package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipApply;
import com.heroxin.system.mapper.internship.InternshipApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipApplyService;

/**
 * 实习申请信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipApplyServiceImpl implements IInternshipApplyService 
{
    @Autowired
    private InternshipApplyMapper internshipApplyMapper;

    /**
     * 查询实习申请信息
     * 
     * @param id 实习申请信息主键
     * @return 实习申请信息
     */
    @Override
    public InternshipApply selectInternshipApplyById(Long id)
    {
        return internshipApplyMapper.selectInternshipApplyById(id);
    }

    /**
     * 查询实习申请信息列表
     * 
     * @param internshipApply 实习申请信息
     * @return 实习申请信息
     */
    @Override
    public List<InternshipApply> selectInternshipApplyList(InternshipApply internshipApply)
    {
        return internshipApplyMapper.selectInternshipApplyList(internshipApply);
    }

    /**
     * 新增实习申请信息
     * 
     * @param internshipApply 实习申请信息
     * @return 结果
     */
    @Override
    public int insertInternshipApply(InternshipApply internshipApply)
    {
        return internshipApplyMapper.insertInternshipApply(internshipApply);
    }

    /**
     * 修改实习申请信息
     * 
     * @param internshipApply 实习申请信息
     * @return 结果
     */
    @Override
    public int updateInternshipApply(InternshipApply internshipApply)
    {
        return internshipApplyMapper.updateInternshipApply(internshipApply);
    }

    /**
     * 批量删除实习申请信息
     * 
     * @param ids 需要删除的实习申请信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipApplyByIds(Long[] ids)
    {
        return internshipApplyMapper.deleteInternshipApplyByIds(ids);
    }

    /**
     * 删除实习申请信息信息
     * 
     * @param id 实习申请信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipApplyById(Long id)
    {
        return internshipApplyMapper.deleteInternshipApplyById(id);
    }
}
