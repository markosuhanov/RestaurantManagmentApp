package com.suhIT.RestaurantManagmentApp.repository;

import com.suhIT.RestaurantManagmentApp.model.Salary;
import com.suhIT.RestaurantManagmentApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, UUID> {
}
