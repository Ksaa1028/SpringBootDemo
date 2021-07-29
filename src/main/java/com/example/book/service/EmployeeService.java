package com.example.book.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.book.dao.Employee;

import java.util.List;

/**
 * @Auther:TongKai
 * @ClassName:EmployeeService
 * @Date:2021/7/23 11:39
 * @功能描述: $FunctionDescription
 * @Version:1.0
 */

public interface EmployeeService extends IService<Employee> {
    List<Employee> listAllByLastName(String lastName);

    Integer deleteById(Long id);

    Integer insertEmployee(Employee employee);

    Integer updateEmployee(Employee employee);
}
