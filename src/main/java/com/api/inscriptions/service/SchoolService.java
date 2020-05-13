package com.api.inscriptions.service;

import com.api.inscriptions.model.School;

import java.util.List;

public interface SchoolService {

    public List<School> getSchools();
    public School getSchoolById(Long id);

}
