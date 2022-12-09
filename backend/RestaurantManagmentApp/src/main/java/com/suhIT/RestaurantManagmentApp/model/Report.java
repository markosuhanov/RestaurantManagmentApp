package com.suhIT.RestaurantManagmentApp.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    public Report() {
    }



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
