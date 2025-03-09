package com.vaghani.caching.caching_app.services;

import com.vaghani.caching.caching_app.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto getEmployeeById(Long id);

    EmployeeDto createNewEmployee(EmployeeDto employeeDto);

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);

    void deleteEmployee(Long id);
}
