Feature: User Registration

Background: Given I navigate to the Register Account page

Scenario: Register with mandatory fields

When I enter first name "Arun" into First name field
And I enter last name "Motoori"
And I enter email address "amotoori@gmail.com" into the email address field
And I enter telefon number "1234567890" into the Phone number field
And I enter password "12345" into the Password field 
And I enter password "12345" into the Password confirm field 
And I select Privacy Policy field
And I click on Continue button
Then Account should get created successfully 

Scenario: Register with all fields

When I enter first name "Arun" into First name field
And I enter last name "Motoori"
And I enter email address "amotoori@gmail.com" into the email address field
And I enter telefon number "1234567890" into the Phone number field
And I enter password "12345" into the Password field 
And I enter password "12345" into the Password confirm field 
And I select Privacy Policy field
And I select Yes for Newsletter
And I click on Continue button
Then Account should get created successfully

Scenario: Register without providing any fields

When I dont enter details into any field
And I click on Continue button
Then Warning messages shoudld be displayed for all mandatory fields

Scenario: Register with duplicate email address

When I enter first name "Arun" into First name field
And I enter last name "Motoori"
And I enter email address "amotoori@gmail.com" into the email address field
And I enter telefon number "1234567890" into the Phone number field
And I enter password "12345" into the Password field 
And I enter password "12345" into the Password confirm field 
And I select Privacy Policy field
And I click on Continue button
Then Warning message about the duplicate email address should be displayed