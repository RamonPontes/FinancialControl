package com.ramon.FinancialControl.service;

import com.ramon.FinancialControl.models.Finance;
import com.ramon.FinancialControl.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinanceServices {

    @Autowired
    private FinanceRepository financeRepository;

    public List<Finance> getAllFinances() {
        return financeRepository.findAll();
    }

    public Optional<Finance> getFinanceById(int id) {
        return financeRepository.findById(id);
    }

    public Finance createFinance(Finance data) {
        return financeRepository.save(data);
    }
}
