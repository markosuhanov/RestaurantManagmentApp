package com.suhIT.RestaurantManagmentApp.controller;

import com.suhIT.RestaurantManagmentApp.dto.SalaryDTO;
import com.suhIT.RestaurantManagmentApp.helper.SalaryMapper;
import com.suhIT.RestaurantManagmentApp.model.Salary;
import com.suhIT.RestaurantManagmentApp.service_implementation.SalaryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/salaries", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class SalaryController {

    @Autowired
    private SalaryServiceImpl salaryService;

    private SalaryMapper salaryMapper;

    public SalaryController() {
        this.salaryMapper = new SalaryMapper();
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<SalaryDTO> createSalary(@RequestBody SalaryDTO salaryDTO) {
        Salary salary;
        try {
            salary = this.salaryService.create(salaryMapper.toEntity(salaryDTO));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(salaryMapper.toDto(salary), HttpStatus.OK);
    }


}
