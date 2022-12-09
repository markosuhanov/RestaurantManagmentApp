package com.suhIT.RestaurantManagmentApp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "waiter_id")
    private User waiter;
    private double price;
    private double cost;
    private Date createdAt;
    private boolean paid;


    public Bill() {
    }

    public Bill(User waiter, double price, double cost, Date createdAt, boolean paid) {
        this.waiter = waiter;
        this.price = price;
        this.cost = cost;
        this.createdAt = createdAt;
        this.paid = paid;
    }


    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User getWaiter() {
        return waiter;
    }

    public void setWaiter(User waiter) {
        this.waiter = waiter;
    }

}
