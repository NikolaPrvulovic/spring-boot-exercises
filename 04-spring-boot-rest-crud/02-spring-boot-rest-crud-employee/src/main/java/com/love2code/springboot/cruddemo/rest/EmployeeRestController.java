package com.love2code.springboot.cruddemo.rest;

import com.love2code.springboot.cruddemo.dao.EmployeeDAO;
import com.love2code.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    //quick and dirty: inject employee dao
    public EmployeeRestController(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }

    //expose "/employees" and return list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }
}
