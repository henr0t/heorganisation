package com.theorganisation.controller;

import com.theorganisation.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DepartmentService {

    @Autowired
    DepartmentRepository dr;

    public Department addDepartment(Department department) {
        System.out.println("Called addDepartment from DepartmentService");
        return dr.save(department);
    }

    public Iterable<Department> getAllDepartments() {
        System.out.println("Called getAllDepartments from DepartmentService");
        return dr.findAll();
    }

    public Department getById(long id) {
        System.out.println("Called getById from DepartmentService");
        return dr.findById(id).get();
    }

    public Department getByName(String name) {
        System.out.println("Called getByName from DepartmentService");
        for (Department dp : getAllDepartments()) {
            if (dp.getName().equalsIgnoreCase(name)) {
                return dp;
            }
        }
        return null;
    }

    public void deleteById(long id) {
        System.out.println("Called deleteById from DepartmentService");
        dr.deleteById(id);
    }


    public Department updateDepartment(long id, Department dp) {
        System.out.println("Called updateDepartment from DepartmentService");
        Department department = getById(id);
        if (dp.getName() != null && dp.getName() != "") {
            department.setName(dp.getName());
        }
        return dr.save(department);
    }
}
