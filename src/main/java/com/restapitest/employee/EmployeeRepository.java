package com.restapitest.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRepository {
    List<Employee> employees;

    public EmployeeRepository()
    {
        employees = new ArrayList<>();
        employees.add(new Employee(1 , "employee1" , 20 , "male" , 1000));
        employees.add(new Employee(2 , "employee2" , 21 , "female" , 2000));
        employees.add(new Employee(3 , "employee3" , 22 , "male" , 3000));
        employees.add(new Employee(4 , "employee4" , 23 , "female" , 4000));
        employees.add(new Employee(5 , "employee5" , 24 , "male" , 5000));
    }

    public List<Employee> getEmployeeList()
    {
        return this.employees;
    }

    public Employee getEmployeeById(Integer id) throws NoSuchEmployeeException {
        return employees.stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchEmployeeException());
    }

    public List<Employee> getEmployeeByGender(String gender) {
        return employees.stream()
                .filter(employee -> employee.getGender().equals(gender))
                .collect(Collectors.toList());
    }
}
