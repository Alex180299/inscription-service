package com.api.inscriptions.service;

import com.api.inscriptions.model.School;
import com.api.inscriptions.school.SchoolRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{

    @Autowired
    private SchoolRestClient schoolRestClient;

    @Override
    public List<School> getSchools() {
        return schoolRestClient.getSchools();
    }

    @Override
    public School getSchoolById(Long id) {
        return schoolRestClient.getSchoolById(id);
    }
}
