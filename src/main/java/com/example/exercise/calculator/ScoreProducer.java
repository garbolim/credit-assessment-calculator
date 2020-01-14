package com.example.exercise.calculator;

import com.example.exercise.dto.CreditScoreInputs;
import com.example.exercise.dto.CreditScoreResult;

public interface ScoreProducer {
	
	void calculate(CreditScoreInputs creditScoreInputs, CreditScoreResult result);

}
