package com.vaghani.caching.caching_app.services;

import com.vaghani.caching.caching_app.entities.Employee;
import com.vaghani.caching.caching_app.entities.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
