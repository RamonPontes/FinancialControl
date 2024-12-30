package com.ramon.FinancialControl.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FinanceController {
    @GetMapping("/")
    public ResponseEntity<?> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }
}
