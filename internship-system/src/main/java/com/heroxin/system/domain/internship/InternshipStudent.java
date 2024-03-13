package com.heroxin.system.domain.internship;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.heroxin.common.annotation.Excel;
import com.heroxin.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 实习生信息对象 internship_student
 * 
 * @author heroxin
 * @date 2024-03-13
 */
public class InternshipStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 学号 */
    @Excel(name = "学号")
    private String code;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String name;

    /** 性别1男2女 */
    @Excel(name = "性别1男2女")
    private String sex;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /** 所学专业 */
    @Excel(name = "所学专业")
    private Long major;

    /** 所属院校 */
    @Excel(name = "所属院校")
    private Long collegeId;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String tel;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setBirthday(Date birthday) 
    {
        this.birthday = birthday;
    }

    public Date getBirthday() 
    {
        return birthday;
    }
    public void setMajor(Long major) 
    {
        this.major = major;
    }

    public Long getMajor() 
    {
        return major;
    }
    public void setCollegeId(Long collegeId) 
    {
        this.collegeId = collegeId;
    }

    public Long getCollegeId() 
    {
        return collegeId;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("name", getName())
            .append("sex", getSex())
            .append("birthday", getBirthday())
            .append("major", getMajor())
            .append("collegeId", getCollegeId())
            .append("tel", getTel())
            .toString();
    }
}
