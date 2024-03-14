package com.heroxin.internship.mapper;

import java.util.List;

import com.heroxin.internship.domain.InternshipGrades;

/**
 * 实习成绩信息Mapper接口
 *
 * @author heroxin
 * @date 2024-03-14
 */
public interface InternshipGradesMapper {
    /**
     * 查询实习成绩信息
     *
     * @param id 实习成绩信息主键
     * @return 实习成绩信息
     */
    public InternshipGrades selectInternshipGradesById(Long id);

    /**
     * 查询实习成绩信息列表
     *
     * @param internshipGrades 实习成绩信息
     * @return 实习成绩信息集合
     */
    public List<InternshipGrades> selectInternshipGradesList(InternshipGrades internshipGrades);

    /**
     * 新增实习成绩信息
     *
     * @param internshipGrades 实习成绩信息
     * @return 结果
     */
    public int insertInternshipGrades(InternshipGrades internshipGrades);

    /**
     * 修改实习成绩信息
     *
     * @param internshipGrades 实习成绩信息
     * @return 结果
     */
    public int updateInternshipGrades(InternshipGrades internshipGrades);

    /**
     * 删除实习成绩信息
     *
     * @param id 实习成绩信息主键
     * @return 结果
     */
    public int deleteInternshipGradesById(Long id);

    /**
     * 批量删除实习成绩信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInternshipGradesByIds(Long[] ids);
}
