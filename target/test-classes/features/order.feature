Feature: End to End Testing with order
@EndToEnd
Scenario: User logins into the page and orders the product

Given Go to the base url
When enter "<username>" and "<password>"
And click on Login button 
And did user reach the home page and "<title>" is displayed
And user selects the product and add to cart
And user goes to cart and click on checkout
And user fills the info <FirstName> <LastName> <zipcode> and clicks on continue
Then product is added and verified with name 
And click on finish button
And Order successfull message is showing "Thank you for your order!"

Examples:
| username                 |   password			|title 				| FirstName | LastName | zipcode |
| standard_user		         | secret_sauce		|	Swag Labs		|   Demo    |  Demo    |  8216   | 