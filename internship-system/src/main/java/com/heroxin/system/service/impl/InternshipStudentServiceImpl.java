package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipStudent;
import com.heroxin.system.mapper.internship.InternshipStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipStudentService;

/**
 * 实习生信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipStudentServiceImpl implements IInternshipStudentService 
{
    @Autowired
    private InternshipStudentMapper internshipStudentMapper;

    /**
     * 查询实习生信息
     * 
     * @param id 实习生信息主键
     * @return 实习生信息
     */
    @Override
    public InternshipStudent selectInternshipStudentById(Long id)
    {
        return internshipStudentMapper.selectInternshipStudentById(id);
    }

    /**
     * 查询实习生信息列表
     * 
     * @param internshipStudent 实习生信息
     * @return 实习生信息
     */
    @Override
    public List<InternshipStudent> selectInternshipStudentList(InternshipStudent internshipStudent)
    {
        return internshipStudentMapper.selectInternshipStudentList(internshipStudent);
    }

    /**
     * 新增实习生信息
     * 
     * @param internshipStudent 实习生信息
     * @return 结果
     */
    @Override
    public int insertInternshipStudent(InternshipStudent internshipStudent)
    {
        return internshipStudentMapper.insertInternshipStudent(internshipStudent);
    }

    /**
     * 修改实习生信息
     * 
     * @param internshipStudent 实习生信息
     * @return 结果
     */
    @Override
    public int updateInternshipStudent(InternshipStudent internshipStudent)
    {
        return internshipStudentMapper.updateInternshipStudent(internshipStudent);
    }

    /**
     * 批量删除实习生信息
     * 
     * @param ids 需要删除的实习生信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipStudentByIds(Long[] ids)
    {
        return internshipStudentMapper.deleteInternshipStudentByIds(ids);
    }

    /**
     * 删除实习生信息信息
     * 
     * @param id 实习生信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipStudentById(Long id)
    {
        return internshipStudentMapper.deleteInternshipStudentById(id);
    }
}
