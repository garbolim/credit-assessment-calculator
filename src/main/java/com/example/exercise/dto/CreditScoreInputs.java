package com.example.exercise.dto;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Inputs required to calculate credit score")
public class CreditScoreInputs {
	
	@NotNull
	@ApiModelProperty(notes = "The number of employees in the company")
	private int numberOfEmployees;
	
	@NotNull
	@ApiModelProperty(notes = "The type of company. Can be one of \"Sole Proprietorship\", \"Limited Liability Company\", \"Partnership\", or \"Others\"")
	private String companyType;
	
	@NotNull
	@ApiModelProperty(notes = "The number of years the company has been in operation")
	private int numberOfYearsOperated;

}
