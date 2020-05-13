package com.api.inscriptions.controller;

import com.api.inscriptions.model.Student;
import com.api.inscriptions.service.InscriptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InscriptionsController {

    @Autowired
    InscriptionsService inscriptionsService;

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Long id){
        return inscriptionsService.findStudentById(id);
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return inscriptionsService.findAllStudents();
    }

}
