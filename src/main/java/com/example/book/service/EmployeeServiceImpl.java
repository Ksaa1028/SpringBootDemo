package com.example.book.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.book.dao.Employee;
import com.example.book.dao.EmployeeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:TongKai
 * @ClassName:EmployeeServiceImpl
 * @Date:2021/7/23 11:40
 * @功能描述: $FunctionDescription
 * @Version:1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Override
    public List<Employee> listAllByLastName(String lastName) {
        return baseMapper.selectAllByLastName(lastName);
    }

    @Override
    public Integer deleteById(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public Integer insertEmployee(Employee employee) {
        return baseMapper.insertEmployee(employee);
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        return baseMapper.undateEmployee(employee);
    }

}
