package com.example.SpringCore.beans;
import org.springframework.stereotype.Component;

@Component  // Marks this class as a Spring-managed Bean
public class DepartmentBean {

    private String departmentName = "Software Development";

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentBean { departmentName='" + departmentName + "' }";
    }
}