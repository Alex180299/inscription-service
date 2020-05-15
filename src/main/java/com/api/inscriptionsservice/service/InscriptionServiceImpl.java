package com.api.inscriptionsservice.service;

import com.api.inscriptionsservice.model.Student;
import com.api.inscriptionsservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación de la capa de servicio de inscripciones
 */
@Service
public class InscriptionServiceImpl implements InscriptionsService{

    @Autowired
    StudentRepository studentRepository;

    /**
     * Encuentra un estudiante por su id
     * @param id Id del estudiante
     * @return Una entidad de estudiante
     */
    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    /**
     * Encuentra todos los estudiantes de la base
     * @return Una lista de estudiantes
     */
    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
