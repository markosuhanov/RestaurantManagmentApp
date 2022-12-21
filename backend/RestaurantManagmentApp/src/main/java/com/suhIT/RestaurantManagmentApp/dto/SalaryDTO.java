package com.suhIT.RestaurantManagmentApp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.lang.NonNull;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class SalaryDTO {

    private double amount;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date startDate;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date endDate;

    private boolean active;

    public SalaryDTO() {
    }

    public SalaryDTO(double amount, Date startDate, Date endDate,  boolean active) {
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
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
