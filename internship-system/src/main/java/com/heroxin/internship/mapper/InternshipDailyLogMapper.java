package com.heroxin.internship.mapper;

import java.util.List;

import com.heroxin.internship.domain.InternshipDailyLog;

/**
 * 实习日志信息Mapper接口
 *
 * @author heroxin
 * @date 2024-03-14
 */
public interface InternshipDailyLogMapper {
    /**
     * 查询实习日志信息
     *
     * @param id 实习日志信息主键
     * @return 实习日志信息
     */
    public InternshipDailyLog selectInternshipDailyLogById(Long id);

    /**
     * 查询实习日志信息列表
     *
     * @param internshipDailyLog 实习日志信息
     * @return 实习日志信息集合
     */
    public List<InternshipDailyLog> selectInternshipDailyLogList(InternshipDailyLog internshipDailyLog);

    /**
     * 新增实习日志信息
     *
     * @param internshipDailyLog 实习日志信息
     * @return 结果
     */
    public int insertInternshipDailyLog(InternshipDailyLog internshipDailyLog);

    /**
     * 修改实习日志信息
     *
     * @param internshipDailyLog 实习日志信息
     * @return 结果
     */
    public int updateInternshipDailyLog(InternshipDailyLog internshipDailyLog);

    /**
     * 删除实习日志信息
     *
     * @param id 实习日志信息主键
     * @return 结果
     */
    public int deleteInternshipDailyLogById(Long id);

    /**
     * 批量删除实习日志信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInternshipDailyLogByIds(Long[] ids);
}
