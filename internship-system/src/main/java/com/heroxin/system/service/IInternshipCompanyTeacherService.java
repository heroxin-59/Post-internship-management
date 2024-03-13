package com.heroxin.system.service;

import com.heroxin.system.domain.internship.InternshipCompanyTeacher;

import java.util.List;

/**
 * 企业讲师信息Service接口
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public interface IInternshipCompanyTeacherService 
{
    /**
     * 查询企业讲师信息
     * 
     * @param id 企业讲师信息主键
     * @return 企业讲师信息
     */
    public InternshipCompanyTeacher selectInternshipCompanyTeacherById(Long id);

    /**
     * 查询企业讲师信息列表
     * 
     * @param internshipCompanyTeacher 企业讲师信息
     * @return 企业讲师信息集合
     */
    public List<InternshipCompanyTeacher> selectInternshipCompanyTeacherList(InternshipCompanyTeacher internshipCompanyTeacher);

    /**
     * 新增企业讲师信息
     * 
     * @param internshipCompanyTeacher 企业讲师信息
     * @return 结果
     */
    public int insertInternshipCompanyTeacher(InternshipCompanyTeacher internshipCompanyTeacher);

    /**
     * 修改企业讲师信息
     * 
     * @param internshipCompanyTeacher 企业讲师信息
     * @return 结果
     */
    public int updateInternshipCompanyTeacher(InternshipCompanyTeacher internshipCompanyTeacher);

    /**
     * 批量删除企业讲师信息
     * 
     * @param ids 需要删除的企业讲师信息主键集合
     * @return 结果
     */
    public int deleteInternshipCompanyTeacherByIds(Long[] ids);

    /**
     * 删除企业讲师信息信息
     * 
     * @param id 企业讲师信息主键
     * @return 结果
     */
    public int deleteInternshipCompanyTeacherById(Long id);
}
