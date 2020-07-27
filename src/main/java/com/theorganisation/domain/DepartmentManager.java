package com.theorganisation.domain;

import javax.persistence.Entity;

@Entity
public class DepartmentManager extends Employee implements MeetingLeader {
    private final String titel = "Department Manager";

    public String getTitel() {
        return titel;
    }

    public void startMeeting() {
    }
}
