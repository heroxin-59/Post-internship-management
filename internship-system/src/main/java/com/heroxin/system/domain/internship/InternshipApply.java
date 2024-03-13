package com.heroxin.system.domain.internship;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习申请信息对象 internship_apply
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public class InternshipApply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 申请实习学生姓名 */
    @Excel(name = "申请实习学生姓名")
    private String name;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyDate;

    /** 申请理由 */
    @Excel(name = "申请理由")
    private String reason;

    /** 实习单位ID */
    @Excel(name = "实习单位ID")
    private Long companyId;

    /** 实习单位名称 */
    @Excel(name = "实习单位名称")
    private String companyName;

    /** 实习岗位 */
    @Excel(name = "实习岗位")
    private String duty;

    /** 实习工作内容 */
    @Excel(name = "实习工作内容")
    private String content;

    /** 指导教师意见 */
    @Excel(name = "指导教师意见")
    private String teacherMemo;

    /** 院系意见 */
    @Excel(name = "院系意见")
    private String yxMemo;

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
    public void setApplyDate(Date applyDate) 
    {
        this.applyDate = applyDate;
    }

    public Date getApplyDate() 
    {
        return applyDate;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setCompanyName(String companyName) 
    {
        this.companyName = companyName;
    }

    public String getCompanyName() 
    {
        return companyName;
    }
    public void setDuty(String duty) 
    {
        this.duty = duty;
    }

    public String getDuty() 
    {
        return duty;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setTeacherMemo(String teacherMemo) 
    {
        this.teacherMemo = teacherMemo;
    }

    public String getTeacherMemo() 
    {
        return teacherMemo;
    }
    public void setYxMemo(String yxMemo) 
    {
        this.yxMemo = yxMemo;
    }

    public String getYxMemo() 
    {
        return yxMemo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("applyDate", getApplyDate())
            .append("reason", getReason())
            .append("companyId", getCompanyId())
            .append("companyName", getCompanyName())
            .append("duty", getDuty())
            .append("content", getContent())
            .append("teacherMemo", getTeacherMemo())
            .append("yxMemo", getYxMemo())
            .toString();
    }
}
