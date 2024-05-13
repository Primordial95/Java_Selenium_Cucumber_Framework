Feature: Login to The Home Page and test HomePage
@Smoke
Scenario Outline: User is able to login to the home page or not

Given Go to the base url
When enter "<username>" and "<password>" 
And click on Login button 
Then did user reach the home page and "<title>" is displayed
And on home page "<products>" section is displayed or not

Examples:
| username                 |   password			|title 				| products |
| standard_user		         | secret_sauce		|	Swag Labs		| Products |
| performance_glitch_user  | secret_sauce		|Swag Labs 		| Products |
| problem_user		         | secret_sauce	  |Swag Labs		| Products |
@Regression
Scenario: about feature is working or not

When enter "<username>" and "<password>"
And click on Login button 
And click on open menu and then click on about section
Then did user reach the page and Logo is displayed

Examples:
| username                 |   password			|
| standard_user		         | secret_sauce		|	