package com.restapitest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    EmployeeRepository emplyeeRepository;

    public EmployeeController()
    {
        EmployeeRepository repository = new EmployeeRepository();
    }

    @GetMapping
    public List<Employee> getEmployeeList()
    {
        return this.emplyeeRepository.getEmployeeList();
    }

    @GetMapping
    public Employee getEmployeeById(Integer id)
    {
        return null;
    }
}
