package com.heroxin.system.service.impl;

import java.util.List;

import com.heroxin.system.domain.internship.InternshipDailyLog;
import com.heroxin.system.mapper.internship.InternshipDailyLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.system.service.IInternshipDailyLogService;

/**
 * 实习日志信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-13
 */
@Service
public class InternshipDailyLogServiceImpl implements IInternshipDailyLogService 
{
    @Autowired
    private InternshipDailyLogMapper internshipDailyLogMapper;

    /**
     * 查询实习日志信息
     * 
     * @param id 实习日志信息主键
     * @return 实习日志信息
     */
    @Override
    public InternshipDailyLog selectInternshipDailyLogById(Long id)
    {
        return internshipDailyLogMapper.selectInternshipDailyLogById(id);
    }

    /**
     * 查询实习日志信息列表
     * 
     * @param internshipDailyLog 实习日志信息
     * @return 实习日志信息
     */
    @Override
    public List<InternshipDailyLog> selectInternshipDailyLogList(InternshipDailyLog internshipDailyLog)
    {
        return internshipDailyLogMapper.selectInternshipDailyLogList(internshipDailyLog);
    }

    /**
     * 新增实习日志信息
     * 
     * @param internshipDailyLog 实习日志信息
     * @return 结果
     */
    @Override
    public int insertInternshipDailyLog(InternshipDailyLog internshipDailyLog)
    {
        return internshipDailyLogMapper.insertInternshipDailyLog(internshipDailyLog);
    }

    /**
     * 修改实习日志信息
     * 
     * @param internshipDailyLog 实习日志信息
     * @return 结果
     */
    @Override
    public int updateInternshipDailyLog(InternshipDailyLog internshipDailyLog)
    {
        return internshipDailyLogMapper.updateInternshipDailyLog(internshipDailyLog);
    }

    /**
     * 批量删除实习日志信息
     * 
     * @param ids 需要删除的实习日志信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipDailyLogByIds(Long[] ids)
    {
        return internshipDailyLogMapper.deleteInternshipDailyLogByIds(ids);
    }

    /**
     * 删除实习日志信息信息
     * 
     * @param id 实习日志信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipDailyLogById(Long id)
    {
        return internshipDailyLogMapper.deleteInternshipDailyLogById(id);
    }
}
