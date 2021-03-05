Feature: Deaceses and condition search features

Scenario: As a user I want to search Deaceses and condition
	Given Open Drugs Website
	When click on deaceses and condition from carousel 
	And Input fever in search textbox
	Then User showes description of fever msg 