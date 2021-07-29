package com.example.book.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther:TongKai
 * @ClassName:Employee
 * @Date:2021/7/23 10:53
 * @功能描述: $FunctionDescription
 * @Version:1.0
 */
@Data

@TableName("tbl_employee")
public class Employee {
    private Long id;
    private String lastName;
    private String email;
    private Integer age;

    public Employee() {
    }

    public Employee(Long id) {
        this.id = id;
    }

    public Employee(Long id, String lastName, String email, Integer age) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Employee(String lastName, String email, Integer age) {
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}


