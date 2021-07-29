package com.example.book.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @Auther:TongKai
 * @ClassName:EmployeeMapper
 * @Date:2021/7/23 10:53
 * @功能描述: $FunctionDescription
 * @Version:1.0
 */
public interface EmployeeMapper  extends BaseMapper<Employee> {
    /* *
     * 功能描述：根据名字查找符合条件
     *
     * @param: [lastName]
     * @return: java.util.List<com.example.book.dao.Employee>
     * @auther: TongKai
     * @date: 2021/7/23 13:34
     */
    List<Employee> selectAllByLastName(@Param("lastName") String lastName);

    /* *
     * 功能描述：根据id删除 数据
     *
     * @param: [id]
     * @return: java.lang.Integer
     * @auther: TongKai
     * @date: 2021/7/23 14:08
     */
    Integer deleteById(@Param("id") Long id);

    /* *
     * 功能描述：增加员工 
     *
     * @param: [id, lsatName, email,  age]
     * @return: java.lang.Integer
     * @auther: TongKai
     * @date: 2021/7/23 14:15
     */
    Integer insertEmployee(Employee employee);

/* *
 * 功能描述：更新 
 *
 * @param: [employee]
 * @return: java.lang.Integer
 * @auther: TongKai
 * @date: 2021/7/23 15:17
 */
    Integer undateEmployee(Employee employee);



}
