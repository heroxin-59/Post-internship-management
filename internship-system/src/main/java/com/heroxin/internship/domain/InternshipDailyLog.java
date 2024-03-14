package com.heroxin.internship.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习日志信息对象 internship_daily_log
 *
 * @author heroxin
 * @date 2024-03-14
 */
public class InternshipDailyLog extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 实习生
     */
    @Excel(name = "实习生")
    private String student;

    /**
     * 实习单位
     */
    @Excel(name = "实习单位")
    private String company;

    /**
     * 工作日志
     */
    @Excel(name = "工作日志")
    private String dailyLog;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setDailyLog(String dailyLog) {
        this.dailyLog = dailyLog;
    }

    public String getDailyLog() {
        return dailyLog;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("student", getStudent())
                .append("company", getCompany())
                .append("dailyLog", getDailyLog())
                .append("createDate", getCreateDate())
                .append("remark", getRemark())
                .toString();
    }
}
