@homefeatures
Feature: Reatail Home Page 

@test 
Scenario: Verify Retail page logo 
	Given User is on retail website 
	Then User verify retail page loge is present 
	
@search 
Scenario: Verify User can Search in Electronics Department 
	Given User is on retail website 
	When User change the category to 'Electronics' 
	And User search for an item 'PlayStation' 
	And User click on Search icon 
	Then Item should be present 
@search1 
Scenario: Verify User can Search in Electronics Department 
	Given User is on retail website 
	When User change the category to 'Smart Home' 
	And User search for an item 'Kasa Smart Light Switch HS200' 
	And User click on Search icon 
	Then Item1 should be present 
@test1 
Scenario: Verify cart icon is present 
	Given User is on retail website 
	When User click on All section 
	Then User verifies 'Shop By department' is present 
	
@testcart 
Scenario: Verify cart icon is present 
	Given User is on retail website 
	When user verifies cart icon is present 
@test2 
Scenario: Verify signin and login 
	Given User is on retail website 
	When user click on Sign in button 
	And user enter valid email "kumar.nagarajan@tekschool.us" and password "Kuilaudi12**" 
	And user verifies TEKSCHOOL title is present 
	Then user click on login button 
@test3 
Scenario: Verify create and login 
	Given User is on retail website 
	When user click on Sign in button 
	And user click on Create New Account button 
	And user enter name "kumar" and email "test12343@tekschool.us" and password "$kK1234&" and confirm password "$kK1234&" 
	And user verifies TEKSCHOOL title is present 
	And user click on sign up button 
	And User enter your name  "kumar" 
	And User enter Your phonenumber "1234567890" 
	And User enter your previous password "$kK1234&" 
	And User enter your new password "$kK12345&" 
	And user enter your confirm password "$kK12345&" 
	And change password save button 
	And Update your personal info 
	And User enter your card number "1234567890123456" 
	And User enter your name on card "kumar kumar" 
	And User enter Exp Month "11" and Exp Year "2026" on card 
	And User enter Security Code "123" 
	Then User enter Add on your card 
	@test4 
Scenario: Verify create and login 
	Given User is on retail website  
	When User click on Test Selenium
    And User click on Drop Down button
    And User select programming language "Java"
    And user select by country "India"
    Then User select by language "English"
    @test12
    Scenario: Verify Shop by Department sidebar  
Given User is on retail website 
When User click on All section 
Then below options are present in Shop by Department sidebar 
|Electronics|Computers|Smart Home|Sports|Automative| 
 @test13
Scenario Outline: Verify department sidebar options    
Given User is on retail website 
When User click on All section 
And User on <department>  
Then below options are present in department 
|<optionOne>|<optionTwo>| 
 
Examples:  
|department| optionOne   | optionTwo| 
| Electronics| TV & Video | Video Games| 
|Computers |Accessories                    |Networking        | 
|Smart Home| Smart Home Lightning          | Plugs and Outlets| 
|Sports    | Athletic Clothing             | Exercise & Fitness| 
|Automotive| Automative Parts & Accessories| MotorCycle & Powersports| 
