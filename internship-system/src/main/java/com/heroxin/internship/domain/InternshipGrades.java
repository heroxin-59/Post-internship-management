package com.heroxin.internship.domain;

import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习成绩信息对象 internship_grades
 *
 * @author heroxin
 * @date 2024-03-14
 */
public class InternshipGrades extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 实习生学号
     */
    @Excel(name = "实习生学号")
    private String code;

    /**
     * 实习生
     */
    @Excel(name = "实习生")
    private String student;

    /**
     * 指导教师
     */
    @Excel(name = "指导教师")
    private String teachet;

    /**
     * 实习单位负责人
     */
    @Excel(name = "实习单位负责人")
    private String companyTeacher;

    /**
     * 实习单位
     */
    @Excel(name = "实习单位")
    private String company;

    /**
     * 出勤成绩1
     */
    @Excel(name = "出勤成绩1")
    private String cq1Grages;

    /**
     * 工作态度成绩1
     */
    @Excel(name = "工作态度成绩1")
    private String at1Grades;

    /**
     * 实习日志成绩1
     */
    @Excel(name = "实习日志成绩1")
    private String log1Grades;

    /**
     * 团队协助成绩1
     */
    @Excel(name = "团队协助成绩1")
    private String team1Grades;

    /**
     * 综合成绩1
     */
    @Excel(name = "综合成绩1")
    private String score;

    /**
     * 出勤成绩2
     */
    @Excel(name = "出勤成绩2")
    private String cq2Grades;

    /**
     * 工作态度成绩2
     */
    @Excel(name = "工作态度成绩2")
    private String at2Grades;

    /**
     * 实习日志成绩2
     */
    @Excel(name = "实习日志成绩2")
    private String log2Grades;

    /**
     * 团队协助成绩2
     */
    @Excel(name = "团队协助成绩2")
    private String team2Grades;

    /**
     * 综合成绩2
     */
    @Excel(name = "综合成绩2")
    private String score1;

    /**
     * 总成绩
     */
    @Excel(name = "总成绩")
    private String totalScore;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public void setTeachet(String teachet) {
        this.teachet = teachet;
    }

    public String getTeachet() {
        return teachet;
    }

    public void setCompanyTeacher(String companyTeacher) {
        this.companyTeacher = companyTeacher;
    }

    public String getCompanyTeacher() {
        return companyTeacher;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCq1Grages(String cq1Grages) {
        this.cq1Grages = cq1Grages;
    }

    public String getCq1Grages() {
        return cq1Grages;
    }

    public void setAt1Grades(String at1Grades) {
        this.at1Grades = at1Grades;
    }

    public String getAt1Grades() {
        return at1Grades;
    }

    public void setLog1Grades(String log1Grades) {
        this.log1Grades = log1Grades;
    }

    public String getLog1Grades() {
        return log1Grades;
    }

    public void setTeam1Grades(String team1Grades) {
        this.team1Grades = team1Grades;
    }

    public String getTeam1Grades() {
        return team1Grades;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setCq2Grades(String cq2Grades) {
        this.cq2Grades = cq2Grades;
    }

    public String getCq2Grades() {
        return cq2Grades;
    }

    public void setAt2Grades(String at2Grades) {
        this.at2Grades = at2Grades;
    }

    public String getAt2Grades() {
        return at2Grades;
    }

    public void setLog2Grades(String log2Grades) {
        this.log2Grades = log2Grades;
    }

    public String getLog2Grades() {
        return log2Grades;
    }

    public void setTeam2Grades(String team2Grades) {
        this.team2Grades = team2Grades;
    }

    public String getTeam2Grades() {
        return team2Grades;
    }

    public void setScore1(String score1) {
        this.score1 = score1;
    }

    public String getScore1() {
        return score1;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("code", getCode())
                .append("student", getStudent())
                .append("teachet", getTeachet())
                .append("companyTeacher", getCompanyTeacher())
                .append("company", getCompany())
                .append("cq1Grages", getCq1Grages())
                .append("at1Grades", getAt1Grades())
                .append("log1Grades", getLog1Grades())
                .append("team1Grades", getTeam1Grades())
                .append("score", getScore())
                .append("cq2Grades", getCq2Grades())
                .append("at2Grades", getAt2Grades())
                .append("log2Grades", getLog2Grades())
                .append("team2Grades", getTeam2Grades())
                .append("score1", getScore1())
                .append("totalScore", getTotalScore())
                .toString();
    }
}
