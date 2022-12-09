package com.suhIT.RestaurantManagmentApp.model;

import javax.persistence.Entity;

@Entity
public class FoodItem extends Item {

    private String allergens;
    private int preparationTime;

    public FoodItem() {
        super();
    }

    public FoodItem(String allergens, int preparationTime) {
        this.allergens = allergens;
        this.preparationTime = preparationTime;
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
