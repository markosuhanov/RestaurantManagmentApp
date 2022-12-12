package com.suhIT.RestaurantManagmentApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class FoodItem extends Item {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String allergens;
    private int preparationTime;

    public FoodItem() {
        super();
    }

    public FoodItem(String allergens, int preparationTime) {
        this.allergens = allergens;
        this.preparationTime = preparationTime;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }
    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }
}
