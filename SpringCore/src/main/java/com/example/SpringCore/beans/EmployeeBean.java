package com.example.SpringCore.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // Marks this class as a Spring-managed Bean
public class EmployeeBean {

    private String employeeName = "Ankit Rajput";

    @Autowired  // Injecting DepartmentBean
    private DepartmentBean departmentBean;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    @Override
    public String toString() {
        return "EmployeeBean { employeeName='" + employeeName +
                "', department=" + departmentBean + " }";
    }
}