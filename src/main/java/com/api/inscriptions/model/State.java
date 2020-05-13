package com.api.inscriptions.model;
import java.util.ArrayList;
import java.util.List;

public class State {

    private Long id;
    private String name;
    private String country;
    private String code;
    private List<School> schools = new ArrayList<School>();;

    public State(){

    }

    public State(Long id, String name, String country, String code) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.code = code;
    }

    public void addSchool(School school){
        schools.add(school);
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
