package com.example.exercise.calculator;

import org.springframework.stereotype.Component;

import com.example.exercise.dto.CreditScoreInputs;
import com.example.exercise.dto.CreditScoreResult;

@Component
public class TimeInBusinessScoreProducer implements ScoreProducer {
	
	@Override
	public void calculate(CreditScoreInputs creditScoreInputs, CreditScoreResult result) {
		
		int timeInBusiness = creditScoreInputs.getNumberOfYearsOperated();
		if (timeInBusiness <= 3) {
			result.add(0);
		} else if (timeInBusiness <= 9) {
			result.add(28);
		} else if (timeInBusiness <= 15) {
			result.add(36);
		} else {
			result.add(59);
		}
	}

}
