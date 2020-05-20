package com.api.inscriptionsservice.service;

import com.api.inscriptionsservice.model.Student;

import java.util.List;

/**
 * Interfaz con los métodos que hará el servicio de inscripciones
 */
public interface InscriptionsService {

    public Student findStudentById(Long id);
    public List<Student> findAllStudents();
    public Student insertNewStudent(Student student);
    public void delete(Student student);
}
