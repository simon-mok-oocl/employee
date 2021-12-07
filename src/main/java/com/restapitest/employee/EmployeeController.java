package com.restapitest.employee;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping(params = {"gender"})
    public List<Employee> getEmployeeByGender(@RequestParam String gender)
    {
        return this.emplyeeRepository.getEmployeeByGender(gender);
    }

    @GetMapping(params = {"page" , "pageSize"})
    public List<Employee> getEmployeeInPage(@RequestParam Integer page , @RequestParam Integer pageSize)
    {
        return this.emplyeeRepository.getEmployeeInPage(page , pageSize);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee newEmployee)
    {
        return this.emplyeeRepository.addEmployee(newEmployee);
    }

}
