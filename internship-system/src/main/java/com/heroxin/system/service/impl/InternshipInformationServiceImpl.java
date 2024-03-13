package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipInformation;
import com.heroxin.system.mapper.internship.InternshipInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipInformationService;

/**
 * 实习信息发布Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipInformationServiceImpl implements IInternshipInformationService 
{
    @Autowired
    private InternshipInformationMapper internshipInformationMapper;

    /**
     * 查询实习信息发布
     * 
     * @param id 实习信息发布主键
     * @return 实习信息发布
     */
    @Override
    public InternshipInformation selectInternshipInformationById(Long id)
    {
        return internshipInformationMapper.selectInternshipInformationById(id);
    }

    /**
     * 查询实习信息发布列表
     * 
     * @param internshipInformation 实习信息发布
     * @return 实习信息发布
     */
    @Override
    public List<InternshipInformation> selectInternshipInformationList(InternshipInformation internshipInformation)
    {
        return internshipInformationMapper.selectInternshipInformationList(internshipInformation);
    }

    /**
     * 新增实习信息发布
     * 
     * @param internshipInformation 实习信息发布
     * @return 结果
     */
    @Override
    public int insertInternshipInformation(InternshipInformation internshipInformation)
    {
        return internshipInformationMapper.insertInternshipInformation(internshipInformation);
    }

    /**
     * 修改实习信息发布
     * 
     * @param internshipInformation 实习信息发布
     * @return 结果
     */
    @Override
    public int updateInternshipInformation(InternshipInformation internshipInformation)
    {
        return internshipInformationMapper.updateInternshipInformation(internshipInformation);
    }

    /**
     * 批量删除实习信息发布
     * 
     * @param ids 需要删除的实习信息发布主键
     * @return 结果
     */
    @Override
    public int deleteInternshipInformationByIds(Long[] ids)
    {
        return internshipInformationMapper.deleteInternshipInformationByIds(ids);
    }

    /**
     * 删除实习信息发布信息
     * 
     * @param id 实习信息发布主键
     * @return 结果
     */
    @Override
    public int deleteInternshipInformationById(Long id)
    {
        return internshipInformationMapper.deleteInternshipInformationById(id);
    }
}
