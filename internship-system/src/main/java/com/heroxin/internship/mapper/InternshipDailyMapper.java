package com.heroxin.internship.mapper;

import java.util.List;

import com.heroxin.internship.domain.InternshipDaily;

/**
 * 实习考勤信息Mapper接口
 *
 * @author heroxin
 * @date 2024-03-14
 */
public interface InternshipDailyMapper {
    /**
     * 查询实习考勤信息
     *
     * @param id 实习考勤信息主键
     * @return 实习考勤信息
     */
    public InternshipDaily selectInternshipDailyById(Long id);

    /**
     * 查询实习考勤信息列表
     *
     * @param internshipDaily 实习考勤信息
     * @return 实习考勤信息集合
     */
    public List<InternshipDaily> selectInternshipDailyList(InternshipDaily internshipDaily);

    /**
     * 新增实习考勤信息
     *
     * @param internshipDaily 实习考勤信息
     * @return 结果
     */
    public int insertInternshipDaily(InternshipDaily internshipDaily);

    /**
     * 修改实习考勤信息
     *
     * @param internshipDaily 实习考勤信息
     * @return 结果
     */
    public int updateInternshipDaily(InternshipDaily internshipDaily);

    /**
     * 删除实习考勤信息
     *
     * @param id 实习考勤信息主键
     * @return 结果
     */
    public int deleteInternshipDailyById(Long id);

    /**
     * 批量删除实习考勤信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInternshipDailyByIds(Long[] ids);
}
