package com.example.exercise.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swagger() {
		
		return new Docket(DocumentationType.SWAGGER_2).select()
		                                              .apis(RequestHandlerSelectors.basePackage("com.example.exercise.controller"))
		                                              .paths(PathSelectors.any())
		                                              .build()
		                                              .apiInfo(getApiInfo());
	}
	
	private ApiInfo getApiInfo() {
		
		return new ApiInfo("Credit Assessment Calculator",
				"Calculator for determining the credit score based on company type, number of employees and time in business.",
				"1.0", null, null, null, null, Collections.emptyList());
	}


}