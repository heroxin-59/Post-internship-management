package com.heroxin.internship.domain;

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
 * @date 2024-03-14
 */
public class InternshipApply extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 实习学生姓名
     */
    @Excel(name = "实习学生姓名")
    private String name;

    /**
     * 实习生学号
     */
    @Excel(name = "实习生学号")
    private String code;

    /**
     * 所学专业
     */
    @Excel(name = "所学专业")
    private String major;

    /**
     * 申请时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date applyDate;

    /**
     * 申请理由
     */
    @Excel(name = "申请理由")
    private String reason;

    /**
     * 申请实习单位
     */
    @Excel(name = "申请实习单位")
    private String company;

    /**
     * 申请岗位
     */
    @Excel(name = "申请岗位")
    private String post;

    /**
     * 指导教师意见
     */
    @Excel(name = "指导教师意见")
    private String teacherMemo;

    /**
     * 实习单位负责人意见
     */
    @Excel(name = "实习单位负责人意见")
    private String headMemo;

    /**
     * 申请状态
     */
    @Excel(name = "申请状态")
    private String status;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }

    public void setTeacherMemo(String teacherMemo) {
        this.teacherMemo = teacherMemo;
    }

    public String getTeacherMemo() {
        return teacherMemo;
    }

    public void setHeadMemo(String headMemo) {
        this.headMemo = headMemo;
    }

    public String getHeadMemo() {
        return headMemo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("code", getCode())
                .append("major", getMajor())
                .append("applyDate", getApplyDate())
                .append("reason", getReason())
                .append("company", getCompany())
                .append("post", getPost())
                .append("teacherMemo", getTeacherMemo())
                .append("headMemo", getHeadMemo())
                .append("status", getStatus())
                .toString();
    }
}
