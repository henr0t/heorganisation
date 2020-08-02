package com.theorganisation.rest;

import com.theorganisation.controller.EmployeeService;
import com.theorganisation.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeEndpoint {

    @Autowired
    EmployeeService es;

    @PostMapping("/new/hrmanager")
    public HrManager addHrManager(@RequestBody HrManager hr) {
        return es.addHrManager(hr);
    }

    @PostMapping("/new/departmentmanager")
    public DepartmentManager addDepartmentManager(@RequestBody DepartmentManager dm) {
        return es.addDepartmentManager(dm);
    }

    @PostMapping("new/programmer")
    public Employee addProgrammer(@RequestBody Programmer ep) {
        return es.addProgrammer(ep);
    }

    @PostMapping("new/consultant")
    public Employee addConsultant(@RequestBody Consultant ec) {
        return es.addConsultant(ec);
    }

    @GetMapping("/all")
    public Iterable<Employee> getAllEmployee() {
        return es.getAllEmployee();
    }

    @GetMapping("/id/{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") long id) {
        return es.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployeeSalary(@PathVariable(value = "id") long id, @RequestBody Employee ep) {
        return es.updateEmployeeSalary(id, ep);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable(value = "id") long id) {
        es.deleteEmployeeById(id);
    }

    @PutMapping("/birthdate/{id}")
    public Employee dateOfBirth(@PathVariable(value = "id") long id, @RequestBody Employee ep) {
        return es.dateOfBirth(id, ep);
    }
}
