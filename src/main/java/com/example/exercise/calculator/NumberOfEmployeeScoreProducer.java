package com.example.exercise.calculator;

import org.springframework.stereotype.Component;

import com.example.exercise.dto.CreditScoreInputs;
import com.example.exercise.dto.CreditScoreResult;

@Component
public class NumberOfEmployeeScoreProducer implements ScoreProducer {

	@Override
	public void calculate(CreditScoreInputs creditScoreInputs, CreditScoreResult result) {
		
		int noOfEmployee = creditScoreInputs.getNumberOfEmployees();
		if (noOfEmployee <= 5) {
			result.add(0);
		} else if (noOfEmployee <= 10) {
			result.add(20);
		} else if (noOfEmployee <= 15) {
			result.add(32);
		} else if (noOfEmployee <= 20) {
			result.add(55);
		} else{
			result.add(70);
		}
	}
}
