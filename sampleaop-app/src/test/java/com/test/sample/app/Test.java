package com.test.sample.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.sample.app.domain.EmployeeDTO;
import com.test.sample.app.domain.EmployeeManager;

public class Test {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AbstractApplicationContext  context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        
        EmployeeManager manager = context.getBean(EmployeeManager.class);
 
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
    }
}
