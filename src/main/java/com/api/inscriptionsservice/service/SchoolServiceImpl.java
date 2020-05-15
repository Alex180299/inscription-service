package com.api.inscriptionsservice.service;

import com.api.inscriptionsservice.model.School;
import com.api.inscriptionsservice.school.SchoolRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementación de la capa de servicio de escuelas
 */
@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private SchoolRestClient schoolRestClient;

    /**
     * Obtiene todas las escuelas
     * @return Una lista de escuelas
     */
    @Override
    public List<School> getSchools() {
        return schoolRestClient.getSchools();
    }

    /**
     * Obtiene una escuela por su id
     * @param id Id de la escuela
     * @return Una entidad de escuela
     */
    @Override
    public School getSchoolById(Long id) {
        return schoolRestClient.getSchoolById(id);
    }
}
