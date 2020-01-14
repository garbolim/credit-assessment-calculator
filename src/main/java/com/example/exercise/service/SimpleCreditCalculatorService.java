package com.example.exercise.service;

import com.example.exercise.dto.CreditScoreInputs;

public interface SimpleCreditCalculatorService {

	Integer calculateCreditScore(CreditScoreInputs creditScoreInputs);
}
