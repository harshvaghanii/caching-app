package com.vaghani.caching.caching_app.services.impl;

import com.vaghani.caching.caching_app.dto.EmployeeDto;
import com.vaghani.caching.caching_app.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeById(Long id) {
        return null;
    }

    @Override
    public EmployeeDto createNewEmployee(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
