package com.heroxin.internship.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.internship.mapper.InternshipInformationMapper;
import com.heroxin.internship.domain.InternshipInformation;
import com.heroxin.internship.service.IInternshipInformationService;

/**
 * 实习信息Service业务层处理
 *
 * @author heroxin
 * @date 2024-03-14
 */
@Service
public class InternshipInformationServiceImpl implements IInternshipInformationService {
    @Autowired
    private InternshipInformationMapper internshipInformationMapper;

    /**
     * 查询实习信息
     *
     * @param id 实习信息主键
     * @return 实习信息
     */
    @Override
    public InternshipInformation selectInternshipInformationById(Long id) {
        return internshipInformationMapper.selectInternshipInformationById(id);
    }

    /**
     * 查询实习信息列表
     *
     * @param internshipInformation 实习信息
     * @return 实习信息
     */
    @Override
    public List<InternshipInformation> selectInternshipInformationList(InternshipInformation internshipInformation) {
        return internshipInformationMapper.selectInternshipInformationList(internshipInformation);
    }

    /**
     * 新增实习信息
     *
     * @param internshipInformation 实习信息
     * @return 结果
     */
    @Override
    public int insertInternshipInformation(InternshipInformation internshipInformation) {
        return internshipInformationMapper.insertInternshipInformation(internshipInformation);
    }

    /**
     * 修改实习信息
     *
     * @param internshipInformation 实习信息
     * @return 结果
     */
    @Override
    public int updateInternshipInformation(InternshipInformation internshipInformation) {
        return internshipInformationMapper.updateInternshipInformation(internshipInformation);
    }

    /**
     * 批量删除实习信息
     *
     * @param ids 需要删除的实习信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipInformationByIds(Long[] ids) {
        return internshipInformationMapper.deleteInternshipInformationByIds(ids);
    }

    /**
     * 删除实习信息信息
     *
     * @param id 实习信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipInformationById(Long id) {
        return internshipInformationMapper.deleteInternshipInformationById(id);
    }
}
