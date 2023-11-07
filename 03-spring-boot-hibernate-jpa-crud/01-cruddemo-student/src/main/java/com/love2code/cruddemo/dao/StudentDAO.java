package com.love2code.cruddemo.dao;

import com.love2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String lastName);
    void updateLastName(Student student);
    void deleteOneById(Integer id);
    int deleteMultipleByCondition(String lastName);
    int deleteAll();
}
