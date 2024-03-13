package com.heroxin.system.domain.internship;

import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习日志信息对象 internship_daily_log
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public class InternshipDailyLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 申请实习学生ID */
    @Excel(name = "申请实习学生ID")
    private Long studentId;

    /** 实习单位ID */
    @Excel(name = "实习单位ID")
    private Long companyId;

    /** 工作日志 */
    @Excel(name = "工作日志")
    private String dailyLog;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setDailyLog(String dailyLog) 
    {
        this.dailyLog = dailyLog;
    }

    public String getDailyLog() 
    {
        return dailyLog;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentId", getStudentId())
            .append("companyId", getCompanyId())
            .append("dailyLog", getDailyLog())
            .append("remark", getRemark())
            .toString();
    }
}
