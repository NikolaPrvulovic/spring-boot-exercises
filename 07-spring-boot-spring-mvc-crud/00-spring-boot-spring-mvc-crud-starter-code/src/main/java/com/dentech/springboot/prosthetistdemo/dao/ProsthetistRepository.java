package com.dentech.springboot.prosthetistdemo.dao;

import com.dentech.springboot.prosthetistdemo.entity.Prosthetist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProsthetistRepository extends JpaRepository<Prosthetist, Integer> {

    // as we extended class to JpaRepository there is no need to write any code


    // add a method to sort by last name - Spring Data JPA does it by itself
    public List<Prosthetist> findAllByOrderByFirstNameAsc();

}
