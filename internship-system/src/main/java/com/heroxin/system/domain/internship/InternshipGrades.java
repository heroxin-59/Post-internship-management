package com.heroxin.system.domain.internship;

import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习成绩信息对象 internship_grades
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public class InternshipGrades extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 实习生学号 */
    @Excel(name = "实习生学号")
    private String code;

    /** 实习生ID */
    @Excel(name = "实习生ID")
    private Long studentId;

    /** 指导教师ID */
    @Excel(name = "指导教师ID")
    private Long teacherId;

    /** 实习单位指导教师ID */
    @Excel(name = "实习单位指导教师ID")
    private Long companyTeacherId;

    /** 实习单位ID */
    @Excel(name = "实习单位ID")
    private Long companyId;

    /** 出勤成绩 */
    @Excel(name = "出勤成绩")
    private String cqGrages;

    /** 工作态度成绩 */
    @Excel(name = "工作态度成绩")
    private String atGrades;

    /** 实习日志成绩 */
    @Excel(name = "实习日志成绩")
    private String logGrades;

    /** 团队协助成绩 */
    @Excel(name = "团队协助成绩")
    private String teamGrades;

    /** 综合成绩 */
    @Excel(name = "综合成绩")
    private String score;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setStudentId(Long studentId) 
    {
        this.studentId = studentId;
    }

    public Long getStudentId() 
    {
        return studentId;
    }
    public void setTeacherId(Long teacherId) 
    {
        this.teacherId = teacherId;
    }

    public Long getTeacherId() 
    {
        return teacherId;
    }
    public void setCompanyTeacherId(Long companyTeacherId) 
    {
        this.companyTeacherId = companyTeacherId;
    }

    public Long getCompanyTeacherId() 
    {
        return companyTeacherId;
    }
    public void setCompanyId(Long companyId) 
    {
        this.companyId = companyId;
    }

    public Long getCompanyId() 
    {
        return companyId;
    }
    public void setCqGrages(String cqGrages) 
    {
        this.cqGrages = cqGrages;
    }

    public String getCqGrages() 
    {
        return cqGrages;
    }
    public void setAtGrades(String atGrades) 
    {
        this.atGrades = atGrades;
    }

    public String getAtGrades() 
    {
        return atGrades;
    }
    public void setLogGrades(String logGrades) 
    {
        this.logGrades = logGrades;
    }

    public String getLogGrades() 
    {
        return logGrades;
    }
    public void setTeamGrades(String teamGrades) 
    {
        this.teamGrades = teamGrades;
    }

    public String getTeamGrades() 
    {
        return teamGrades;
    }
    public void setScore(String score) 
    {
        this.score = score;
    }

    public String getScore() 
    {
        return score;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("studentId", getStudentId())
            .append("teacherId", getTeacherId())
            .append("companyTeacherId", getCompanyTeacherId())
            .append("companyId", getCompanyId())
            .append("cqGrages", getCqGrages())
            .append("atGrades", getAtGrades())
            .append("logGrades", getLogGrades())
            .append("teamGrades", getTeamGrades())
            .append("score", getScore())
            .toString();
    }
}
