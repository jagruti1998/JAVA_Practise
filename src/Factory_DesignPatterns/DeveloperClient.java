package Factory_DesignPatterns;

public class DeveloperClient {
    public static void main(String[] args){
        //Here client is creating the object by its own and AndroidDeveloper is tightly coupled class
        //thus we cannot change things or based on parameters we cannot change objects
       // Employee employee= new AndroidDeveloper();

        //So to solve this problem: 1.Class should not be tightly coupled 2.Based on the input we create object

        Employee employee =EmployeeFactory.getEmployee("AndroidDeveloper");
        System.out.println(employee);
        int salary=employee.salary();//check whos salary we are getting web developer or android based on empType
        System.out.println("Salary: "+salary);

        Employee employee2=EmployeeFactory.getEmployee("WebDeveloper");
        System.out.println("salary: " +employee2.salary());
    }
}
