package com.restapitest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private EmployeeRepository emplyeeRepository;

    public EmployeeController()
    {
        this.emplyeeRepository = new EmployeeRepository();
    }

    @GetMapping
    public List<Employee> getEmployeeList()
    {
        return this.emplyeeRepository.getEmployeeList();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) throws NoSuchEmployeeException {
        return this.emplyeeRepository.getEmployeeById(id);
    }
}
