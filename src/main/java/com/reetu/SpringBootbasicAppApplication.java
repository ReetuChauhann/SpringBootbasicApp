package com.reetu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.reetu.beans.Employee;

@SpringBootApplication
public class SpringBootbasicAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootbasicAppApplication.class, args);
		
		Employee e1=ctx.getBean(Employee.class);
    	e1.setName("Reetu Chauhan");
    	e1.setSalary(100000);
    	e1.getAddress().setCity("Gurugram");
    	e1.getAddress().setState("Harayana");
    	System.out.println(e1.getName());
    	System.out.println(e1.getSalary());
    	System.out.println(e1.getAddress().getCity());
    	System.out.println(e1.getAddress().getState());
    	
    	Employee e2=ctx.getBean(Employee.class);
    	System.out.println(e2.getName());
    	System.out.println(e2.getSalary());
    	System.out.println(e2.getAddress().getCity());
    	System.out.println(e2.getAddress().getState());
	}

}

