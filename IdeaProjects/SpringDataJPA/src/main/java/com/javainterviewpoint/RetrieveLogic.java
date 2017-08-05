package com.javainterviewpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RetrieveLogic
{
    private static RetrieveLogic retrieveLogic;

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args)
    {
        // Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

        // Get the RetrieveLogic bean
        retrieveLogic = (RetrieveLogic) context.getBean("retrieveLogic");
        
        retrieveLogic.retrieveEmployee();
        
        context.close();
    }
    public void retrieveEmployee()
    {
        // Get list of all Employee & Employee Address
        List<Employee_Address> empAddress = employeeRepository.findAll();

        // Displaying the Employee details
        for (Employee_Address employeeAddress : empAddress)
        {
            System.out.println("*** Employee Details ***");

            Employee employee = employeeAddress.getEmployee();
            System.out.println("Employee Id   : " + employee.getEmpId());
            System.out.println("Employee Name : " + employee.getEmpName());

            System.out.println("*** Employee Address Details ***");
            System.out.println("Street  : " + employeeAddress.getStreet());
            System.out.println("City    : " + employeeAddress.getCity());
            System.out.println("State   : " + employeeAddress.getState());
            System.out.println("Country : " + employeeAddress.getCountry());
        }
    }
}
