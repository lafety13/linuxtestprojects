package com.javainterviewpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SaveLogic 
{
    private static SaveLogic saveLogic;
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    public static void main( String[] args )
    {
        //Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        
        //Get the SaveLogic bean
        saveLogic = (SaveLogic)context.getBean("saveLogic");
        
        saveLogic.saveEmployee();
        
        context.close();
    }
    
    public void saveEmployee()
    {
        Employee employee = new Employee();
        employee.setEmpName("JIP");
        
        Employee_Address employeeAddress = new Employee_Address();
        employeeAddress.setStreet("Street 1");
        employeeAddress.setCity("City 1");
        employeeAddress.setCountry("Country 1");
        employeeAddress.setState("State 1");
        
        employee.setEmployeeAddress(employeeAddress);
        employeeAddress.setEmployee(employee);
        
        employeeRepository.save(employeeAddress);
        System.out.println("Employee and Employee Address saved successfully!!");
    }
}
