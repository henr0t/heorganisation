package com.theorganisation.domain;

import javax.persistence.Entity;

@Entity
public class Programmer extends Employee {
    private final String titel = "Programmer";

    public String getTitel() {
        return titel;
    }
}
