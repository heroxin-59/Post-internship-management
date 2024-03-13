package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipGrades;
import com.heroxin.system.mapper.internship.InternshipGradesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipGradesService;

/**
 * 实习成绩信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipGradesServiceImpl implements IInternshipGradesService 
{
    @Autowired
    private InternshipGradesMapper internshipGradesMapper;

    /**
     * 查询实习成绩信息
     * 
     * @param id 实习成绩信息主键
     * @return 实习成绩信息
     */
    @Override
    public InternshipGrades selectInternshipGradesById(Long id)
    {
        return internshipGradesMapper.selectInternshipGradesById(id);
    }

    /**
     * 查询实习成绩信息列表
     * 
     * @param internshipGrades 实习成绩信息
     * @return 实习成绩信息
     */
    @Override
    public List<InternshipGrades> selectInternshipGradesList(InternshipGrades internshipGrades)
    {
        return internshipGradesMapper.selectInternshipGradesList(internshipGrades);
    }

    /**
     * 新增实习成绩信息
     * 
     * @param internshipGrades 实习成绩信息
     * @return 结果
     */
    @Override
    public int insertInternshipGrades(InternshipGrades internshipGrades)
    {
        return internshipGradesMapper.insertInternshipGrades(internshipGrades);
    }

    /**
     * 修改实习成绩信息
     * 
     * @param internshipGrades 实习成绩信息
     * @return 结果
     */
    @Override
    public int updateInternshipGrades(InternshipGrades internshipGrades)
    {
        return internshipGradesMapper.updateInternshipGrades(internshipGrades);
    }

    /**
     * 批量删除实习成绩信息
     * 
     * @param ids 需要删除的实习成绩信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipGradesByIds(Long[] ids)
    {
        return internshipGradesMapper.deleteInternshipGradesByIds(ids);
    }

    /**
     * 删除实习成绩信息信息
     * 
     * @param id 实习成绩信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipGradesById(Long id)
    {
        return internshipGradesMapper.deleteInternshipGradesById(id);
    }
}
