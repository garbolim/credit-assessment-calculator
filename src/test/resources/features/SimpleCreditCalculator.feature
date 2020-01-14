Feature: Credit Assessment Calculator
  This is a simple credit assessment calculator feature for software engineer candidates

Scenario Outline: Calculate Credit Assessment Score
  When The calculateCreditAssessmentScore API is called with parameters <numberOfEmployees>, "<companyType>", <numberOfYearsOperated>
  Then The credit assessment score should match <result>

# Test data includes data for coverage, different variation with 2 fixed inputs, invalid string input, case sensitivity
Examples:
  | numberOfEmployees | companyType | numberOfYearsOperated | result |
  | 6 | Sole Proprietorship | 5 | 60 |
  | 1 | Limited Liability Company | 2 | 63 |
  | 11 | Partnership | 14 | 143 |
  | 20 | Others | 18 | 114 |
  | 100 | Limited Liability Company | 1 | 133 |
  | 1 | Others | 1 | 0 |
  | 1 | Others | 5 | 28 |
  | 1 | Others | 10 | 36 |
  | 1 | Others | 20| 59 |
  | 6 | Others | 1 | 20 |
  | 11 | Others | 1 | 32 |
  | 16 | Others | 1 | 55 |
  | 25 | Others | 2| 70 |
  | 1 | Sole Proprietorship | 1 | 12 |
  | 1 | Limited Liability Company | 1 | 63 |
  | 1 | Partnership | 1 | 75 |    
  | 1 |  | 1 | 0 |
  | 1 | sole proprietorship | 1 | 12 |
  | 1 | limited Liability Company | 1 | 63 |
  | 1 | PARTNERSHIP | 1 | 75 |
  | 1 | otHerS | 1 | 0 |    
  | 0 | Others | -1 | 0 |
   