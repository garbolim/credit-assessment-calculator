package com.example.exercise;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.exercise.dto.CreditScoreInputs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SimpleCreditCalculatorSteps {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	private Integer scoreFromApi;
	
	@When("The calculateCreditAssessmentScore API is called with parameters {int}, {string}, {int}")
	public void callSimpleCreditCalculatorApiWithParameters(int numberOfEmployees, String companyType, int numberOfYearsOperated) {
		
		ResponseEntity<Integer> result = testRestTemplate.postForEntity("/calculateCreditScore",
				new CreditScoreInputs(numberOfEmployees, companyType, numberOfYearsOperated), Integer.class);
		assertThat(result.getStatusCode(), equalTo(HttpStatus.OK));
		scoreFromApi = result.getBody();
	}
	
	@Then("The credit assessment score should match {int}")
	public void verifyCalculatedCredits(final int result) {
		
		assertThat(scoreFromApi, equalTo(result));
	}

}
