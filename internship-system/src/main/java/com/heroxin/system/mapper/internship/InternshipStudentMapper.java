package com.heroxin.system.mapper.internship;

import com.heroxin.system.domain.internship.InternshipStudent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 实习生信息Mapper接口
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Mapper
public interface InternshipStudentMapper 
{
    /**
     * 查询实习生信息
     * 
     * @param id 实习生信息主键
     * @return 实习生信息
     */
    public InternshipStudent selectInternshipStudentById(Long id);

    /**
     * 查询实习生信息列表
     * 
     * @param internshipStudent 实习生信息
     * @return 实习生信息集合
     */
    public List<InternshipStudent> selectInternshipStudentList(InternshipStudent internshipStudent);

    /**
     * 新增实习生信息
     * 
     * @param internshipStudent 实习生信息
     * @return 结果
     */
    public int insertInternshipStudent(InternshipStudent internshipStudent);

    /**
     * 修改实习生信息
     * 
     * @param internshipStudent 实习生信息
     * @return 结果
     */
    public int updateInternshipStudent(InternshipStudent internshipStudent);

    /**
     * 删除实习生信息
     * 
     * @param id 实习生信息主键
     * @return 结果
     */
    public int deleteInternshipStudentById(Long id);

    /**
     * 批量删除实习生信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInternshipStudentByIds(Long[] ids);
}
