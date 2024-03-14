package com.heroxin.internship.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.heroxin.internship.mapper.InternshipDailyMapper;
import com.heroxin.internship.domain.InternshipDaily;
import com.heroxin.internship.service.IInternshipDailyService;

/**
 * 实习考勤信息Service业务层处理
 * 
 * @author heroxin
 * @date 2024-03-14
 */
@Service
public class InternshipDailyServiceImpl implements IInternshipDailyService 
{
    @Autowired
    private InternshipDailyMapper internshipDailyMapper;

    /**
     * 查询实习考勤信息
     * 
     * @param id 实习考勤信息主键
     * @return 实习考勤信息
     */
    @Override
    public InternshipDaily selectInternshipDailyById(Long id)
    {
        return internshipDailyMapper.selectInternshipDailyById(id);
    }

    /**
     * 查询实习考勤信息列表
     * 
     * @param internshipDaily 实习考勤信息
     * @return 实习考勤信息
     */
    @Override
    public List<InternshipDaily> selectInternshipDailyList(InternshipDaily internshipDaily)
    {
        return internshipDailyMapper.selectInternshipDailyList(internshipDaily);
    }

    /**
     * 新增实习考勤信息
     * 
     * @param internshipDaily 实习考勤信息
     * @return 结果
     */
    @Override
    public int insertInternshipDaily(InternshipDaily internshipDaily)
    {
        return internshipDailyMapper.insertInternshipDaily(internshipDaily);
    }

    /**
     * 修改实习考勤信息
     * 
     * @param internshipDaily 实习考勤信息
     * @return 结果
     */
    @Override
    public int updateInternshipDaily(InternshipDaily internshipDaily)
    {
        return internshipDailyMapper.updateInternshipDaily(internshipDaily);
    }

    /**
     * 批量删除实习考勤信息
     * 
     * @param ids 需要删除的实习考勤信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipDailyByIds(Long[] ids)
    {
        return internshipDailyMapper.deleteInternshipDailyByIds(ids);
    }

    /**
     * 删除实习考勤信息信息
     * 
     * @param id 实习考勤信息主键
     * @return 结果
     */
    @Override
    public int deleteInternshipDailyById(Long id)
    {
        return internshipDailyMapper.deleteInternshipDailyById(id);
    }
}
