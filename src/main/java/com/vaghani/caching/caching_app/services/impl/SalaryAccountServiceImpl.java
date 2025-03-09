package com.vaghani.caching.caching_app.services.impl;

import com.vaghani.caching.caching_app.entities.Employee;
import com.vaghani.caching.caching_app.entities.SalaryAccount;
import com.vaghani.caching.caching_app.repositories.SalaryAccountRepository;
import com.vaghani.caching.caching_app.services.SalaryAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class SalaryAccountServiceImpl implements SalaryAccountService {

    private final SalaryAccountRepository salaryAccountRepository;

    @Override
    public void createAccount(Employee employee) {
        SalaryAccount salaryAccount = SalaryAccount
                .builder()
                .balance(BigDecimal.ZERO)
                .employee(employee)
                .build();
        salaryAccountRepository.save(salaryAccount);

    }

    @Override
    @Transactional
    public SalaryAccount incrementBalance(Long accountId) {
        SalaryAccount salaryAccount = salaryAccountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        BigDecimal prevBalance = salaryAccount.getBalance();
        BigDecimal newBalance = prevBalance.add(BigDecimal.valueOf(1L));

        salaryAccount.setBalance(newBalance);

        return salaryAccountRepository.save(salaryAccount);
    }
}
