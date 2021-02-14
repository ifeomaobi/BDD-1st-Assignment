@Login
Feature: Validate Techfios Login Functionality

Background: 
	Given User is on the Techfios Login Page 

@Scenario1  @smoke
Scenario: 1 User should be able to log in with valid credentials
	Given User enters username as "demo@techfios.com" 
	Given User enters password as "abc123"  
	When User clicks on signin button 
	Then User should land on Dashboard page 

@Scenario2	
Scenario: 2 User should not be able to log in with valid credentials
	Given User enters username as "demo2@techfios.com" 
	Given User enters password as "abc123"  
	When User clicks on signin button 
	Then User should land on Dashboard page 

@Scenario3	@smoke
Scenario: 3 User should be able to log in with valid credentials
	Given User enters username as "demo@techfios.com" 
	Given User enters password as "abc124"  
	When User clicks on signin button 
	Then User should land on Dashboard page 

@Scenario4	
Scenario: 4 User should be able to log in with valid credentials
	Given User enters username as "demo3@techfios.com" 
	Given User enters password as "abc124"  
	When User clicks on signin button 
	Then User should land on Dashboard page 