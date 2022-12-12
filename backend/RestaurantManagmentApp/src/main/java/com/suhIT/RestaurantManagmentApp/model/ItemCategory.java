package com.suhIT.RestaurantManagmentApp.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    public ItemCategory() {
    }

    public ItemCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
