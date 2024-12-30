package com.ramon.FinancialControl.controller;

import com.ramon.FinancialControl.models.Finance;
import com.ramon.FinancialControl.service.FinanceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FinanceController {

    @Autowired
    private FinanceServices financeServices;

    @GetMapping("/")
    public ResponseEntity<?> getAllFinances() {
        return ResponseEntity.ok(financeServices.getAllFinances());
    }

    @PostMapping("/")
    public ResponseEntity<?> createFinance(@RequestBody Finance data) {
        return ResponseEntity.ok(financeServices.createFinance(data));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFinanceById(@PathVariable int id) {
        return ResponseEntity.ok(financeServices.getFinanceById(id));
    }
}
