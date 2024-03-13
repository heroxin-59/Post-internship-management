package com.heroxin.system.domain.internship;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习总结信息对象 internship_summary
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public class InternshipSummary extends BaseEntity
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

    /** 实习开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实习开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 实习结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "实习结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 工作总结 */
    @Excel(name = "工作总结")
    private String workSumup;

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
    public void setWorkSumup(String workSumup) 
    {
        this.workSumup = workSumup;
    }

    public String getWorkSumup() 
    {
        return workSumup;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentId", getStudentId())
            .append("companyId", getCompanyId())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("workSumup", getWorkSumup())
            .toString();
    }
}
