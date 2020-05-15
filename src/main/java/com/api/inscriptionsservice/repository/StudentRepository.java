package com.api.inscriptionsservice.repository;

import com.api.inscriptionsservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Repositorio para acceder a los datos guardados en la base por medio de JPA
 */
@Component
public interface StudentRepository extends JpaRepository<Student, Long> {
}
