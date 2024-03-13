package com.heroxin.system.domain.internship;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习信息发布对象 internship_information
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public class InternshipInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 实习岗位 */
    @Excel(name = "实习岗位")
    private String name;

    /** 实习工作内容 */
    @Excel(name = "实习工作内容")
    private String workContent;

    /** 实习单位ID */
    @Excel(name = "实习单位ID")
    private Long companyId;

    /** 实习开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实习开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 实习结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实习结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 所需专业 */
    @Excel(name = "所需专业")
    private Long major;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contract;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setWorkContent(String workContent) 
    {
        this.workContent = workContent;
    }

    public String getWorkContent() 
    {
        return workContent;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }
    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }
    public void setMajor(Long major) 
    {
        this.major = major;
    }

    public Long getMajor() 
    {
        return major;
    }
    public void setContract(String contract) 
    {
        this.contract = contract;
    }

    public String getContract() 
    {
        return contract;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("workContent", getWorkContent())
            .append("companyId", getCompanyId())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("major", getMajor())
            .append("contract", getContract())
            .append("remark", getRemark())
            .toString();
    }
}
