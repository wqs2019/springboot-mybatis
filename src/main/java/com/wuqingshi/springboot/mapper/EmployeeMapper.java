package com.wuqingshi.springboot.mapper;

import com.wuqingshi.springboot.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public Employee insertEmp(Employee employee);
}
