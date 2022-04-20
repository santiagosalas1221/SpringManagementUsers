package com.register.management.controller;

import com.register.management.model.Employee;
import com.register.management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Metodo encargado de listar todos los empleados quecontenga la DB
    @GetMapping("/employees")
    public List<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }

    //Metodo encargado de guardar un empleado en la DB
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

}
