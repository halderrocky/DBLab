package edu.sdccd.cisc191.dblab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Option {
    @Id
    private String details;

    public Option() {

    }

    public String getDetails() {
        return details;
    }

    public Option(String details) {
        this.details = details;
    }
}
