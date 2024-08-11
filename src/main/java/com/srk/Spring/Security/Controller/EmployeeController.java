package com.srk.Spring.Security.Controller;

import com.srk.Spring.Security.Model.Employee;
import com.srk.Spring.Security.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class EmployeeController
{

    @Autowired
    public EmployeeService service;

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Employee> admin()
    {
        return service.getAllEmployees();
    }

    @GetMapping("/employee")
    @PreAuthorize("hasRole('USER')")
    public String emp()
    {
        return "Hello! User";
    }

    @GetMapping("/guest")
    public String guest() {
        return "hello there";
    }

}