package com.api.inscriptionsservice.school;

import com.api.inscriptionsservice.model.School;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Cliente rest para acceder al micro servicio school service
 */
@FeignClient(name = "school-service")
public interface SchoolRestClient {

    /**
     * Método para obtener todas las escuelas registradas en el school service
     * @return Lista de todas las escuelas
     */
    @GetMapping("/schools")
    public List<School> getSchools();

    /**
     * Método para obtener una escuela por un id
     * @param id Id de la escuela que se necesita
     * @return Una entidad de escuela
     */
    @GetMapping("/school/{id}")
    public School getSchoolById(@PathVariable Long id);
}
