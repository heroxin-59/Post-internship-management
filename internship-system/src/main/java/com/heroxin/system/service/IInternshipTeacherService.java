package com.heroxin.system.service;

import com.heroxin.system.domain.internship.InternshipTeacher;

import java.util.List;

/**
 * 指导教师信息Service接口
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public interface IInternshipTeacherService 
{
    /**
     * 查询指导教师信息
     * 
     * @param id 指导教师信息主键
     * @return 指导教师信息
     */
    public InternshipTeacher selectInternshipTeacherById(Long id);

    /**
     * 查询指导教师信息列表
     * 
     * @param internshipTeacher 指导教师信息
     * @return 指导教师信息集合
     */
    public List<InternshipTeacher> selectInternshipTeacherList(InternshipTeacher internshipTeacher);

    /**
     * 新增指导教师信息
     * 
     * @param internshipTeacher 指导教师信息
     * @return 结果
     */
    public int insertInternshipTeacher(InternshipTeacher internshipTeacher);

    /**
     * 修改指导教师信息
     * 
     * @param internshipTeacher 指导教师信息
     * @return 结果
     */
    public int updateInternshipTeacher(InternshipTeacher internshipTeacher);

    /**
     * 批量删除指导教师信息
     * 
     * @param ids 需要删除的指导教师信息主键集合
     * @return 结果
     */
    public int deleteInternshipTeacherByIds(Long[] ids);

    /**
     * 删除指导教师信息信息
     * 
     * @param id 指导教师信息主键
     * @return 结果
     */
    public int deleteInternshipTeacherById(Long id);
}
