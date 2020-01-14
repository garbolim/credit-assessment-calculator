package com.example.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exercise.calculator.ScoreProducer;
import com.example.exercise.dto.CreditScoreInputs;
import com.example.exercise.dto.CreditScoreResult;

@Service
public class SimpleCreditCalculatorServiceImpl implements SimpleCreditCalculatorService {
	
	@Autowired
	private List<ScoreProducer> creditCalculatorInputs;

	@Override
	public Integer calculateCreditScore(CreditScoreInputs creditScoreInputs) {
		
		CreditScoreResult result = new CreditScoreResult();
		creditCalculatorInputs.forEach(input -> input.calculate(creditScoreInputs, result));
		return result.getScore();
	}

}
