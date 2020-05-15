package com.api.inscriptionsservice.controller;

import com.api.inscriptionsservice.model.School;
import com.api.inscriptionsservice.model.Student;
import com.api.inscriptionsservice.service.InscriptionsService;
import com.api.inscriptionsservice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador para acceder a los estudiantes y las escuelas
 */
@RestController
public class InscriptionsController {

    @Autowired
    InscriptionsService inscriptionsService;

    @Autowired
    SchoolService schoolService;

    /**
     * Obtiene un estudiante de la base de datos a partir del id proporcionado
     * @param id Id del estudiante que se necesite
     * @return Una entidad de estudiante
     */
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Long id){
        return inscriptionsService.findStudentById(id);
    }

    /**
     * Obtiene todos los estudiantes que esten almacenados en la base de datos
     * @return Una lista de estudiantes
     */
    @GetMapping("/students")
    public List<Student> getStudents(){
        return inscriptionsService.findAllStudents();
    }

    /**
     * Obtiene todas las escuelas que esten almacenadas en el microservicio school service
     * @return Una lista de escuelas
     */
    @GetMapping("/schools")
    public List<School> getSchools(){
        return schoolService.getSchools();
    }

}
