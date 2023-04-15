Feature: Login to application

Narrative: Login to application

Scenario: Verify user should be able to login to flipkart application with valid user details
Meta:
@test
@banking

Given Open flipkart application
When user enters a username <username> and password <password>
Then Verifies user logged in to flipkart application with valid user details
Examples:
|username|password|
|radha.mane@gmail.com|Test@1234|