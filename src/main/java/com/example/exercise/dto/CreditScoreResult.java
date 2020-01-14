package com.example.exercise.dto;

import lombok.Getter;

@Getter
public class CreditScoreResult {

	private int score = 0;
	
	public void add(int newScore) {
		
		score += newScore;
	}
}
