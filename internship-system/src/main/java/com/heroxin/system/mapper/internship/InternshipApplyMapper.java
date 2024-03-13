package com.heroxin.system.mapper.internship;

import com.heroxin.system.domain.internship.InternshipApply;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 实习申请信息Mapper接口
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Mapper
public interface InternshipApplyMapper 
{
    /**
     * 查询实习申请信息
     * 
     * @param id 实习申请信息主键
     * @return 实习申请信息
     */
    public InternshipApply selectInternshipApplyById(Long id);

    /**
     * 查询实习申请信息列表
     * 
     * @param internshipApply 实习申请信息
     * @return 实习申请信息集合
     */
    public List<InternshipApply> selectInternshipApplyList(InternshipApply internshipApply);

    /**
     * 新增实习申请信息
     * 
     * @param internshipApply 实习申请信息
     * @return 结果
     */
    public int insertInternshipApply(InternshipApply internshipApply);

    /**
     * 修改实习申请信息
     * 
     * @param internshipApply 实习申请信息
     * @return 结果
     */
    public int updateInternshipApply(InternshipApply internshipApply);

    /**
     * 删除实习申请信息
     * 
     * @param id 实习申请信息主键
     * @return 结果
     */
    public int deleteInternshipApplyById(Long id);

    /**
     * 批量删除实习申请信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInternshipApplyByIds(Long[] ids);
}
