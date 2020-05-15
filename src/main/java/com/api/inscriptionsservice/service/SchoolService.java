package com.api.inscriptionsservice.service;

import com.api.inscriptionsservice.model.School;

import java.util.List;

/**
 * Interfaz del servicio de escuelas
 */
public interface SchoolService {

    public List<School> getSchools();
    public School getSchoolById(Long id);

}
