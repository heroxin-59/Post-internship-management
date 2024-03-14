package com.heroxin.internship.domain;

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
 * @date 2024-03-14
 */
public class InternshipDaily extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 实习生 */
    @Excel(name = "实习生")
    private String student;

    /** 实习单位 */
    @Excel(name = "实习单位")
    private String company;

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
    public void setStudent(String student) 
    {
        this.student = student;
    }

    public String getStudent() 
    {
        return student;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
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
            .append("student", getStudent())
            .append("company", getCompany())
            .append("dailyDate", getDailyDate())
            .append("onTime", getOnTime())
            .append("offTime", getOffTime())
            .toString();
    }
}
