package com.srk.Spring.Security.Service;

import com.srk.Spring.Security.Model.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = List.of
            (new Employee
                            (1,"srk",20000.0)
                    ,new Employee(2,"jeevan",1000.0)
                    ,new Employee(3,"vinay",1500.0)
                    ,new Employee(4,"shankar",2000.0));

    public List<Employee> getAllEmployees()
    {
        return employees;
    }

}