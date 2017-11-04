Feature: To test RadioCheckboxDD

Scenario:To test startdate
Given I am on zoositeRDDCB
	When I click on "adoption_link"
	Then I set the start date to "Today"
	Then I close the browser
	
	Scenario:To populate contact form
Given I am on zoositeRDDCB
	When I click on "contact_link"
	Then I populate contact form
	Then I close the browser