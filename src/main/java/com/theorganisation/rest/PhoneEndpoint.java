package com.theorganisation.rest;

import com.theorganisation.controller.EmployeeService;
import com.theorganisation.controller.PhoneService;
import com.theorganisation.domain.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/phone")
public class PhoneEndpoint {

    @Autowired
    PhoneService ps;

    @Autowired
    EmployeeService es;

    @PostMapping("/new")
    public Phone addPhone(@RequestBody Phone phone) {
        return ps.addPhone(phone);
    }

    @GetMapping("/all")
    public Iterable<Phone> getAllPhone() {
        return ps.getAllPhone();
    }

    @PostMapping("/employee/{id}/{phoneid}")
    public void addPhoneToEmployee(@PathVariable(value = "id") long id, @PathVariable(value = "phoneid") long phoneid) {
        es.addPhoneToEmployee(id, phoneid);
    }
}
