package com.api.inscriptions.school;

import com.api.inscriptions.model.School;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "school-service")
public interface SchoolRestClient {

    @GetMapping("/schools")
    public List<School> getSchools();

    @GetMapping("/school/{id}")
    public School getSchoolById(@PathVariable Long id);
}
