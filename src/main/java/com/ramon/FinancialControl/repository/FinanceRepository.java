package com.ramon.FinancialControl.repository;

import com.ramon.FinancialControl.models.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceRepository extends JpaRepository<Finance, Integer> { }