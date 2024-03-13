package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipCompanyTeacher;
import com.heroxin.system.mapper.internship.InternshipCompanyTeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipCompanyTeacherService;

/**
 * 企业讲师信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipCompanyTeacherServiceImpl implements IInternshipCompanyTeacherService 
{
    @Autowired
    private InternshipCompanyTeacherMapper internshipCompanyTeacherMapper;

    /**
     * 查询企业讲师信息
     * 
     * @param id 企业讲师信息主键
     * @return 企业讲师信息
     */
    @Override
    public InternshipCompanyTeacher selectInternshipCompanyTeacherById(Long id)
    {
        return internshipCompanyTeacherMapper.selectInternshipCompanyTeacherById(id);
    }

    /**
     * 查询企业讲师信息列表
     * 
     * @param internshipCompanyTeacher 企业讲师信息
     * @return 企业讲师信息
     */
    @Override
    public List<InternshipCompanyTeacher> selectInternshipCompanyTeacherList(InternshipCompanyTeacher internshipCompanyTeacher)
    {
        return internshipCompanyTeacherMapper.selectInternshipCompanyTeacherList(internshipCompanyTeacher);
    }

    /**
     * 新增企业讲师信息
     * 
     * @param internshipCompanyTeacher 企业讲师信息
     * @return 结果
     */
    @Override
    public int insertInternshipCompanyTeacher(InternshipCompanyTeacher internshipCompanyTeacher)
    {
        return internshipCompanyTeacherMapper.insertInternshipCompanyTeacher(internshipCompanyTeacher);
    }

    /**
     * 修改企业讲师信息
     * 
     * @param internshipCompanyTeacher 企业讲师信息
     * @return 结果
     */
    @Override
    public int updateInternshipCompanyTeacher(InternshipCompanyTeacher internshipCompanyTeacher)
    {
        return internshipCompanyTeacherMapper.updateInternshipCompanyTeacher(internshipCompanyTeacher);
    }

    /**
     * 批量删除企业讲师信息
     * 
     * @param ids 需要删除的企业讲师信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipCompanyTeacherByIds(Long[] ids)
    {
        return internshipCompanyTeacherMapper.deleteInternshipCompanyTeacherByIds(ids);
    }

    /**
     * 删除企业讲师信息信息
     * 
     * @param id 企业讲师信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipCompanyTeacherById(Long id)
    {
        return internshipCompanyTeacherMapper.deleteInternshipCompanyTeacherById(id);
    }
}
