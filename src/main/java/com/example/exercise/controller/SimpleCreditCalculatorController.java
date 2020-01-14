package com.example.exercise.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercise.dto.CreditScoreInputs;
import com.example.exercise.service.SimpleCreditCalculatorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Simple Credit Calculator", value= "SimpleCreditCalculator")
public class SimpleCreditCalculatorController {
	
	@Autowired
	private SimpleCreditCalculatorService creditCalculatorService;
	
	@PostMapping(value = "/calculateCreditScore", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Calculates credit score based on company type, number of employees and time in business")
	public Integer calculateCreditScore(@Valid @RequestBody CreditScoreInputs creditScoreInputs) {
		
		return creditCalculatorService.calculateCreditScore(creditScoreInputs);
	}

}
