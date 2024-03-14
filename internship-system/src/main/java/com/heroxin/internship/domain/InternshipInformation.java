package com.heroxin.internship.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习信息对象 internship_information
 *
 * @author heroxin
 * @date 2024-03-14
 */
public class InternshipInformation extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 实习单位
     */
    @Excel(name = "实习单位")
    private String company;

    /**
     * 实习岗位
     */
    @Excel(name = "实习岗位")
    private String duty;

    /**
     * 所需专业
     */
    @Excel(name = "所需专业")
    private String major;

    /**
     * 实习工作内容
     */
    @Excel(name = "实习工作内容")
    private String workContent;

    /**
     * 实习开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实习开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /**
     * 实习结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实习结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /**
     * 联系人
     */
    @Excel(name = "联系人")
    private String contract;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getContract() {
        return contract;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("company", getCompany())
                .append("duty", getDuty())
                .append("major", getMajor())
                .append("workContent", getWorkContent())
                .append("startDate", getStartDate())
                .append("endDate", getEndDate())
                .append("contract", getContract())
                .append("remark", getRemark())
                .toString();
    }
}
