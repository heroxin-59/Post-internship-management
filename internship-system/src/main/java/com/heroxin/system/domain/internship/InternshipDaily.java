package com.heroxin.system.domain.internship;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习考勤信息对象 internship_daily
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public class InternshipDaily extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 实习生ID */
    @Excel(name = "实习生ID")
    private Long studentId;

    /** 实习单位ID */
    @Excel(name = "实习单位ID")
    private Long companyId;

    /** 考勤日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考勤日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dailyDate;

    /** 上班时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上班时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date onTime;

    /**  下班时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = " 下班时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date offTime;

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
    public void setDailyDate(Date dailyDate) 
    {
        this.dailyDate = dailyDate;
    }

    public Date getDailyDate() 
    {
        return dailyDate;
    }
    public void setOnTime(Date onTime) 
    {
        this.onTime = onTime;
    }

    public Date getOnTime() 
    {
        return onTime;
    }
    public void setOffTime(Date offTime) 
    {
        this.offTime = offTime;
    }

    public Date getOffTime() 
    {
        return offTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentId", getStudentId())
            .append("companyId", getCompanyId())
            .append("dailyDate", getDailyDate())
            .append("onTime", getOnTime())
            .append("offTime", getOffTime())
            .toString();
    }
}
