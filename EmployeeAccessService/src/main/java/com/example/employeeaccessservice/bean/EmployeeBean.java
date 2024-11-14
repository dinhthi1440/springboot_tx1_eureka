package com.example.employeeaccessservice.bean;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userId;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String toString() {
        return "EmployeeBean [userId=" + userId + ", name=" + name + "]";
    }
    public EmployeeBean() {

    }

    public EmployeeBean(String userId, String name) {
        super();
        this.userId = userId;
        this.name = name;
    }
}
