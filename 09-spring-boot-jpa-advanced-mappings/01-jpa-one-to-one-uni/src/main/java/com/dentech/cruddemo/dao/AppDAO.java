package com.dentech.cruddemo.dao;

import com.dentech.cruddemo.entity.Instructor;



public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

}
