package com.api.inscriptions.service;

import com.api.inscriptions.model.Student;

import java.util.List;

public interface InscriptionsService {

    public Student findStudentById(Long id);
    public List<Student> findAllStudents();

}
