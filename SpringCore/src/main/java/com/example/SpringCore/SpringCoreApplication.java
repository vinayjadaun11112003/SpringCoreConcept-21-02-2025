package com.example.SpringCore;

import com.example.SpringCore.beans.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    //UC01 : Application Created with spring initiallizer.
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

		// UC03 : Retrieving EmployeeBean from ApplicationContext
		EmployeeBean employee = context.getBean(EmployeeBean.class);
		System.out.println(" Employee Details: " + employee);
	}

}
