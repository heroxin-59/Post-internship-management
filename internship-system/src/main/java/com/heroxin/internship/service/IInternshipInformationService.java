package com.heroxin.internship.service;

import java.util.List;

import com.heroxin.internship.domain.InternshipInformation;

/**
 * 实习信息Service接口
 *
 * @author heroxin
 * @date 2024-03-14
 */
public interface IInternshipInformationService {
    /**
     * 查询实习信息
     *
     * @param id 实习信息主键
     * @return 实习信息
     */
    public InternshipInformation selectInternshipInformationById(Long id);

    /**
     * 查询实习信息列表
     *
     * @param internshipInformation 实习信息
     * @return 实习信息集合
     */
    public List<InternshipInformation> selectInternshipInformationList(InternshipInformation internshipInformation);

    /**
     * 新增实习信息
     *
     * @param internshipInformation 实习信息
     * @return 结果
     */
    public int insertInternshipInformation(InternshipInformation internshipInformation);

    /**
     * 修改实习信息
     *
     * @param internshipInformation 实习信息
     * @return 结果
     */
    public int updateInternshipInformation(InternshipInformation internshipInformation);

    /**
     * 批量删除实习信息
     *
     * @param ids 需要删除的实习信息主键集合
     * @return 结果
     */
    public int deleteInternshipInformationByIds(Long[] ids);

    /**
     * 删除实习信息信息
     *
     * @param id 实习信息主键
     * @return 结果
     */
    public int deleteInternshipInformationById(Long id);
}
