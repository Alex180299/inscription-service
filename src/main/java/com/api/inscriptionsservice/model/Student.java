package com.api.inscriptionsservice.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entidad de los estudiantes
 */
@Entity
@Table(name = "students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private School school;

    /**
     * Constructor vacío
     */
    public Student() { }

    /**
     * Constructor con todos los atributos como parámetro
     * @param id Id del estudiante (Por defecto lo asigna la base)
     * @param name Nombre del estudiante
     * @param email Correo del estudiante
     * @param age Edad del estudiante
     * @param school Escuela a la que pertenece
     */
    public Student(Long id, String name, String email, Integer age, School school) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.school = school;
    }

    /**
     * Método getter del Id del estudiante
     * @return Id del estudiante
     */
    public Long getId() {
        return id;
    }

    /**
     * Método setter del Id del estudiante
     * @param id Id del estudiante
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Método getter del nombre del estudiante
     * @return Nombre del estudiante
     */
    public String getName() {
        return name;
    }

    /**
     * Método setter del nombre estudiante
     * @param name Nombre del estudiante
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método getter del correo del estudiante
     * @return Correo del estudiante
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método setter del correo del estudiante
     * @param email Correo del estudiante
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método getter de la edad del estudiante
     * @return Edad del estudiante
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Método setter de la edad del estudiante
     * @param age Edad del estudiante
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Método getter de la escuela
     * @return Escuela a la que pertenece el estudiante
     */
    public School getSchool() {
        return school;
    }

    /**
     * Método setter de la escuela
     * @param school Escuela a la que pertenece el estudiante
     */
    public void setSchool(School school) {
        this.school = school;
    }
}
