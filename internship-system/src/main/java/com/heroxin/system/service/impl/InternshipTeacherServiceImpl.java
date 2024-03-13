package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipTeacher;
import com.heroxin.system.mapper.internship.InternshipTeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipTeacherService;

/**
 * 指导教师信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipTeacherServiceImpl implements IInternshipTeacherService 
{
    @Autowired
    private InternshipTeacherMapper internshipTeacherMapper;

    /**
     * 查询指导教师信息
     * 
     * @param id 指导教师信息主键
     * @return 指导教师信息
     */
    @Override
    public InternshipTeacher selectInternshipTeacherById(Long id)
    {
        return internshipTeacherMapper.selectInternshipTeacherById(id);
    }

    /**
     * 查询指导教师信息列表
     * 
     * @param internshipTeacher 指导教师信息
     * @return 指导教师信息
     */
    @Override
    public List<InternshipTeacher> selectInternshipTeacherList(InternshipTeacher internshipTeacher)
    {
        return internshipTeacherMapper.selectInternshipTeacherList(internshipTeacher);
    }

    /**
     * 新增指导教师信息
     * 
     * @param internshipTeacher 指导教师信息
     * @return 结果
     */
    @Override
    public int insertInternshipTeacher(InternshipTeacher internshipTeacher)
    {
        return internshipTeacherMapper.insertInternshipTeacher(internshipTeacher);
    }

    /**
     * 修改指导教师信息
     * 
     * @param internshipTeacher 指导教师信息
     * @return 结果
     */
    @Override
    public int updateInternshipTeacher(InternshipTeacher internshipTeacher)
    {
        return internshipTeacherMapper.updateInternshipTeacher(internshipTeacher);
    }

    /**
     * 批量删除指导教师信息
     * 
     * @param ids 需要删除的指导教师信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipTeacherByIds(Long[] ids)
    {
        return internshipTeacherMapper.deleteInternshipTeacherByIds(ids);
    }

    /**
     * 删除指导教师信息信息
     * 
     * @param id 指导教师信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipTeacherById(Long id)
    {
        return internshipTeacherMapper.deleteInternshipTeacherById(id);
    }
}
