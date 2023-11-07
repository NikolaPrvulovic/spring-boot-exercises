package com.love2code.springboot.cruddemo.dao;

import com.love2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
