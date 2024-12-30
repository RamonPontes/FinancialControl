package com.ramon.FinancialControl.service;

import com.ramon.FinancialControl.models.Finance;
import com.ramon.FinancialControl.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceServices {

    @Autowired
    private FinanceRepository financeRepository;

    public List<Finance> getAllFinances() {
        return financeRepository.findAll();
    }
}
