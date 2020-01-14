package com.example.exercise.calculator;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.example.exercise.dto.CreditScoreInputs;
import com.example.exercise.dto.CreditScoreResult;

@Component
public class CompanyTypeScoreProducer implements ScoreProducer {
	
	private static final Map<String, Integer> SCORE_MAP = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	
	static {
		SCORE_MAP.put("Sole Proprietorship", 12);
		SCORE_MAP.put("Limited Liability Company", 63);
		SCORE_MAP.put("Partnership", 75);
		SCORE_MAP.put("Others", 0);
	}
	
	@Override
	public void calculate(CreditScoreInputs creditScoreInputs, CreditScoreResult result) {
		
		Integer score = SCORE_MAP.get(creditScoreInputs.getCompanyType());
		if (score != null) {
			result.add(score);
		}
	}
	
}
