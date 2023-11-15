package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${operatingSystems}")
    private List<String> operatingSystems;


    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        theModel.addAttribute("student", new Student());

        // add the list of countries to the model
        theModel.addAttribute("countries", this.countries);

        // add the list of favorite languages to the model
        theModel.addAttribute("languages", this.languages);

        // add the list of favorite OS to the model
        theModel.addAttribute("operatingSystems", this.operatingSystems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent){

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " \n" + theStudent.getLastName()
                + "; \nCountry: " + theStudent.getCountry() + "; \nFavorite Language: "
                + theStudent.getFavoriteLanguage() + "; \nFavorite OS: " + theStudent.getFavoriteOs() + ";");



        return "student-confirmation";
    }
}
