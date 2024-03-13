package com.heroxin.system.mapper.internship;

import com.heroxin.system.domain.internship.InternshipInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 实习信息发布Mapper接口
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Mapper
public interface InternshipInformationMapper 
{
    /**
     * 查询实习信息发布
     * 
     * @param id 实习信息发布主键
     * @return 实习信息发布
     */
    public InternshipInformation selectInternshipInformationById(Long id);

    /**
     * 查询实习信息发布列表
     * 
     * @param internshipInformation 实习信息发布
     * @return 实习信息发布集合
     */
    public List<InternshipInformation> selectInternshipInformationList(InternshipInformation internshipInformation);

    /**
     * 新增实习信息发布
     * 
     * @param internshipInformation 实习信息发布
     * @return 结果
     */
    public int insertInternshipInformation(InternshipInformation internshipInformation);

    /**
     * 修改实习信息发布
     * 
     * @param internshipInformation 实习信息发布
     * @return 结果
     */
    public int updateInternshipInformation(InternshipInformation internshipInformation);

    /**
     * 删除实习信息发布
     * 
     * @param id 实习信息发布主键
     * @return 结果
     */
    public int deleteInternshipInformationById(Long id);

    /**
     * 批量删除实习信息发布
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInternshipInformationByIds(Long[] ids);
}
