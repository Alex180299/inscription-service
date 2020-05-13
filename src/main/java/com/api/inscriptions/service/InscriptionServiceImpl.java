package com.api.inscriptions.service;

import com.api.inscriptions.model.Student;
import com.api.inscriptions.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionServiceImpl implements InscriptionsService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
