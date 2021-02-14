@OtherLogin 
Feature: Validate Techfios Login 

Background: 
	Given User is on the Techfios Login Page 

@Scenario1  @smoke
Scenario Outline: 1 User should be able to log in with valid credentials
	When User enters "<userName>" and "<password>" 
	When User clicks on signin button 
	Then User should land on Dashboard page 	
	Then User should click on Bank and Cash 
	Then User should click on new account 
	Then User should be able to enter AccountTitle as "MyPersonal1"
	Then User should be able to enter Description as "Savings" 
	Then User should be able to enter InitialBalance as "$10000"
	Then User should be able to enter AccountNumber as "2346567891"
	Then User should be able to enter ContactPersons "Ifeoma Nwajagu"
	Then User should be able to enter Phone as "8173467890"
	Then User should be able to click on submit button
	
	
	

	
	Examples:
	|userName			|password|
	|demo@techfios.com	|abc123 | 
	
	
	
	


	
	