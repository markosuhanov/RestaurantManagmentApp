package com.suhIT.RestaurantManagmentApp.helper;

import com.suhIT.RestaurantManagmentApp.dto.SalaryDTO;
import com.suhIT.RestaurantManagmentApp.model.Salary;

public class SalaryMapper implements MapperInterface<Salary, SalaryDTO> {

    @Override
    public Salary toEntity(SalaryDTO salaryDTO) {
        return new Salary(salaryDTO.getAmount(), salaryDTO.getStartDate(), salaryDTO.getEndDate(), salaryDTO.isActive());
    }

    @Override
    public SalaryDTO toDto(Salary salary) {
        return new SalaryDTO(salary.getAmount(), salary.getStartDate(), salary.getEndDate(), salary.isActive());
    }
}
