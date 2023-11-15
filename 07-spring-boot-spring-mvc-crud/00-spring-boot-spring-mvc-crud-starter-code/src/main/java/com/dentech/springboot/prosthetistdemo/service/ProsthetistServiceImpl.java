package com.dentech.springboot.prosthetistdemo.service;

import com.dentech.springboot.prosthetistdemo.dao.ProsthetistRepository;
import com.dentech.springboot.prosthetistdemo.entity.Prosthetist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProsthetistServiceImpl implements ProsthetistService {

    private ProsthetistRepository prosthetistRepository;

    @Autowired
    public ProsthetistServiceImpl(ProsthetistRepository theProsthetistRepository) {
        prosthetistRepository = theProsthetistRepository;
    }

    @Override
    public List<Prosthetist> findAll() {
        return prosthetistRepository.findAllByOrderByFirstNameAsc();
    }

    @Override
    public Prosthetist findById(int theId) {
        Optional<Prosthetist> result = prosthetistRepository.findById(theId);

        Prosthetist theProsthetist = null;

        if (result.isPresent()) {
            theProsthetist = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theProsthetist;
    }

    @Override
    public Prosthetist save(Prosthetist theProsthetist) {
        return prosthetistRepository.save(theProsthetist);
    }

    @Override
    public void deleteById(int theId) {
        prosthetistRepository.deleteById(theId);
    }
}






