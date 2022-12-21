package com.suhIT.RestaurantManagmentApp.service;

import com.suhIT.RestaurantManagmentApp.dto.SalaryDTO;
import com.suhIT.RestaurantManagmentApp.model.Salary;

import java.util.List;
import java.util.UUID;

public interface SalaryService {


    public Salary create(Salary entity);

    public Salary update(Salary entity, UUID id);

    public void delete(UUID id);

    public List<Salary> findAll();


    public Salary findOne(UUID id);
    public Salary findActive();

    // write query for this
    public List<Salary> getAllSalariesForPeriod();

    public double getTotalAmountForPeriod(List<Salary> salaries);

    public Salary deactivateSalary(Salary salary);


}
