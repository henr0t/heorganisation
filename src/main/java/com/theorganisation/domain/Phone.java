package com.theorganisation.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "telefoon")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    int phonenumber;

    @OneToOne(mappedBy = "phone")
    @JsonBackReference
    private Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
