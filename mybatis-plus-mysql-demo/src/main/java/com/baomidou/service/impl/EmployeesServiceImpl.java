package com.baomidou.service.impl;

import com.baomidou.entity.Employees;
import com.baomidou.mapper.EmployeesMapper;
import com.baomidou.service.IEmployeesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工记录表 服务实现类
 * </p>
 *
 * @author qiao
 * @since 2024-09-11 22:45:15
 */
@Service
public class EmployeesServiceImpl extends ServiceImpl<EmployeesMapper, Employees> implements IEmployeesService {

}
