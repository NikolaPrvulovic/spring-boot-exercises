package com.dentech.cruddemo.dao;

import com.dentech.cruddemo.entity.Instructor;
import com.dentech.cruddemo.entity.InstructorDetail;


public interface AppDAO {

    void save(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailsById(int id);

    void deleteInstructorDetailById(int id);
}
