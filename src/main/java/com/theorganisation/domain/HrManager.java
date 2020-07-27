package com.theorganisation.domain;

import javax.persistence.Entity;

@Entity
public class HrManager extends Employee {
    private final String titel = "HR Manager";

    public String getTitel() {
        return titel;
    }
}
