package com.suhIT.RestaurantManagmentApp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private double amount;
    private Date startDate;
    private Date endDate;
    private boolean active;
    public Salary() {
    }

    public Salary(double amount, Date startDate, Date endDate, boolean active) {
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
