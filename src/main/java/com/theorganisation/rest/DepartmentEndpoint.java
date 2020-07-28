package com.theorganisation.rest;

import com.theorganisation.controller.DepartmentService;
import com.theorganisation.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
public class DepartmentEndpoint {

    @Autowired
    DepartmentService ds;

    @PostMapping("/new")
    public Department addDepartment(@RequestBody Department department) {
        return ds.addDepartment(department);
    }

    @GetMapping("/all")
    public Iterable<Department> getAllDepartments() {
        return ds.getAllDepartments();
    }

    @GetMapping("/id/{id}")
    public Department getDepartmentById(@PathVariable(value = "id") long id) {
        return ds.getById(id);
    }

    @GetMapping("/name/{name}")
    public Department getDepartmentByName(@PathVariable(value = "name") String name) {
        return ds.getByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable(value = "id") long id) {
        ds.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Department updateDepartment(@PathVariable(value = "id") long id, @RequestBody Department dp) {
        return ds.updateDepartment(id, dp);
    }
}
