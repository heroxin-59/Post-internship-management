package com.heroxin.system.service.student.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heroxin.common.utils.StringUtils;
import com.heroxin.system.domain.student.SysStudent;
import com.heroxin.system.mapper.student.SysStudentMapper;
import com.heroxin.system.service.student.ISysStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author heroxin
 * @since 2023-12-29
 */
@Service
public class SysStudentServiceImpl extends ServiceImpl<SysStudentMapper, SysStudent> implements ISysStudentService {

    @Override
    public List<SysStudent> queryList(SysStudent sysStudent) {
        QueryWrapper<SysStudent> queryWrapper = Wrappers.query();
        if (StringUtils.isNotEmpty(sysStudent.getStudentName()))
        {
            queryWrapper.eq("student_name", sysStudent.getStudentName());
        }
        if (StringUtils.isNotNull(sysStudent.getStudentAge()))
        {
            queryWrapper.eq("student_age", sysStudent.getStudentAge());
        }
        if (StringUtils.isNotEmpty(sysStudent.getStudentHobby()))
        {
            queryWrapper.eq("student_hobby", sysStudent.getStudentHobby());
        }
        return this.list(queryWrapper);
    }
}
