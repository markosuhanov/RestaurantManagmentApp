package com.suhIT.RestaurantManagmentApp.model;

import javax.persistence.*;

@Entity
public class DrinkItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String allergens;
    private int preparationTime;

    public DrinkItem() {
        super();
    }

    public DrinkItem(String allergens, int preparationTime) {
        this.allergens = allergens;
        this.preparationTime = preparationTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
