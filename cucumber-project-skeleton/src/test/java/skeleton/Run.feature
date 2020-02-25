Feature: Login

various scenario for TestMeApp login.

@smoke @sanity
Scenario: valid login
 Given user is on the login page
 When  user provides valid username and password
 Then  login sucessfully
 
 @sanity
 Scenario: Invalid login
 Given login page is opened
 When  user provides Invalid username and password
 Then user should get an Invalid error message
 
 @sanity
 Scenario: blank login
 Given user navigate to login page
 When  user provides Blank username and password
 Then  user should get an blank error message 