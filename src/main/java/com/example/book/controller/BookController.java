package com.example.book.controller;

import com.example.book.dao.Employee;
import com.example.book.dao.EmployeeMapper;
import com.example.book.entity.Book;
import com.example.book.service.EmployeeService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import javax.xml.ws.Response;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther:TongKai
 * @ClassName:BookController
 * @Date:2021/7/22 14:01
 * @功能描述: $FunctionDescription
 * @Version:1.0
 */
@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeService employeeService;

    @Value("${wuhan2020}")
    String wuhan2020;

    private List<Book> books = new ArrayList<Book>();

    @PostMapping("/book")
    public ResponseEntity<List<Book>> addBook(@RequestBody Book book) {
        books.add(book);
        return ResponseEntity.ok(books);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity deleteBookById(@PathVariable("id") int id) {
        books.remove(id);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/book")
    public ResponseEntity getBookByName(@RequestParam("name") String name) {
       /* System.out.println("根据名字查找");
        List<Employee> list = employeeService.listAllByLastName("tom");
        list.forEach(System.out::println);
        System.out.println("===========================================");
        System.out.println("查找全部第一种");
        List<Employee> employees = employeeMapper.selectList(null);
        employees.forEach(System.out::println);
        System.out.println("==============================================");*/

       /* System.out.println("根据id删除,");
        Integer integer = employeeService.deleteById(2L);
        System.out.println("删除完，查找全部第二种");
        List<Employee> list2 = employeeService.list();
        list2.forEach(System.out::println);
        System.out.println("====================================");
        System.out.println("增加员工");
        //Employee ee = new Employee(4l,"kass","kass@qq.com",23);
        Employee ee = new Employee(1L,"ll","ll@qq.com",23);
        Integer integer1 = employeeService.insertEmployee(ee);
        List<Employee> list3 = employeeService.list();
        list3.forEach(System.out::println);
        System.out.println("增加完新员工");
        System.out.println("===========================================");*/
        System.out.println("修改员工信息");
        Employee ksaa = new Employee(3L,"ksaa", "ksaa@163.com", 23);
        Integer integer2 = employeeService.updateEmployee(ksaa);
        List<Employee> employeesa = employeeMapper.selectList(null);
        employeesa.forEach(System.out::println);
        System.out.println("打印修改后表");
        System.out.println("==================================================");

        System.out.println(wuhan2020);
        List<Book> results = books.stream().filter(book -> book.getClass().equals(name)).collect(Collectors.toList());

        return ResponseEntity.ok(results);
    }

}
