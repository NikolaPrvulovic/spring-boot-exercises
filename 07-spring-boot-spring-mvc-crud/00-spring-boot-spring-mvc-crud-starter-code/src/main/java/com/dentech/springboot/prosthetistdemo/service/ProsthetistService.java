package com.dentech.springboot.prosthetistdemo.service;

import com.dentech.springboot.prosthetistdemo.entity.Prosthetist;

import java.util.List;

public interface ProsthetistService {

    List<Prosthetist> findAll();

    Prosthetist findById(int theId);

    Prosthetist save(Prosthetist theProsthetist);

    void deleteById(int theId);

}
