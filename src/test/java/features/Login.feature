Feature: Login into Application 

Scenario Outline: Positive test validating login 
Given Initialize the browser with chrome 
Given Navigate to "https://rahulshettyacademy.com/" Site 
Given Click on Login link in home page to land on Secure sign in Page 
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in
And Close the browsers

Examples:
|username					|password	|
|test99@gmail.com	|123456		|
|abc@gmail.com		|123456		|