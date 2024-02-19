package com.heroxin.system.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.heroxin.system.domain.SysStudent;

import java.util.List;

/**
 * <p>
 * 学生信息表 服务类
 * </p>
 *
 * @author heroxin
 * @since 2023-12-29
 */
public interface ISysStudentService extends IService<SysStudent> {
    List<SysStudent> queryList(SysStudent sysStudent);

}
