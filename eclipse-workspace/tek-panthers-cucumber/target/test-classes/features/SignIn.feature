@smoke
Feature: Sign In Feature 

#this is comment

Background: 
	Given User is on retail website 
	When User click on Sign in option 
@smoke(order=3)
Scenario: Verify user can sign in into Retail Application 
	And User enter email  "kumar.nagarajan@tekschool.us" and password "Kuilaudi12**" 
	And User click on login button 
	Then User should be logged in into Account 
	
@smoke(order=2)
Scenario Outline: Verify user can login with different email and pass 
	And User enter email <email> and password <password> 
	And User click on login button 
	Then User should be logged in into Account 
	
	Examples: 
		| email                             | password       |
		| 'kumar.nagarajan@tekschool.us'    | 'Kuilaudi12**' |
		| 'test1234@tekschool.us'          | '$kK12345&' |
		| 'test12348@tekschool.us'          | '$kK12345&' |
		@smoke(order=1)
		Scenario: verify user can create an account into retail website 
			And user click on create new account button 
			And user fill the signup information  with below data 
				|name|email|password|confirmpassword|
				|kumar|test12345@tekschool.us|$kK12345&|$kK12345&|
			And user click on signup button 
			Then user should be logged into account page 
			
