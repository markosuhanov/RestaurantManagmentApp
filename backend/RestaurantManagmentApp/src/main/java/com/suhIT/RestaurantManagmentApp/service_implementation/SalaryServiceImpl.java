package com.suhIT.RestaurantManagmentApp.service_implementation;

import com.suhIT.RestaurantManagmentApp.model.Salary;
import com.suhIT.RestaurantManagmentApp.repository.SalaryRepository;
import com.suhIT.RestaurantManagmentApp.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryRepository salaryRepository;


    @Override
    public Salary create(Salary entity) {
        return this.salaryRepository.save(entity);

    }

    @Override
    public Salary update(Salary entity, UUID id) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public List<Salary> findAll() {
        return null;
    }

    @Override
    public Salary findOne(UUID id) {
        return null;
    }

    @Override
    public Salary findActive() {
        return null;
    }

    @Override
    public List<Salary> getAllSalariesForPeriod() {
        return null;
    }

    @Override
    public double getTotalAmountForPeriod(List<Salary> salaries) {
        return 0;
    }

    @Override
    public Salary deactivateSalary(Salary salary) {
        return null;
    }


}

