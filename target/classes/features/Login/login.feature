Feature: Login Page
  I want to Test The Login Page

  Background:
    Given The Login Page is Open

  @endtoendautomation @endtoendautomation @smoke
  Scenario: Valid Login Page is Open
    Then Valid Login Page is Open
#
  #@regression
  #Scenario Outline: Login with Valid Credentials
    #When I enter Username as "<username>" and Password as "<password>"
    #And I click login button
    #Then dashboard page is open
#
    #Examples:
      #| username          | password  |
      #| nmx@digibuild.com | this4now! |
      #| nmx@digibuild.com | this4now@ |
#
#
  #@regression
  #Scenario Outline: Login with Invalid Credentials
    #When I enter Username as "<username>" and Password as "<password>"
    #And I click login button
    #Then errorMessage as <errorMessage> on LoginPage is displayed
#
    #Examples:
      #|      username       | password  |                      errorMessage                      |
      #| dummy@digibuild.com | this4now! | The username or password you have entered is incorrect |
      #| nmx@digibuild.com   | dummy!    | The username or password you have entered is incorrect |
      #| dummy@digibuild.com | dummy!    | The username or password you have entered is incorrect |
      #| nmx@digibuild.com   |           | Password is require                                    |
      #|                     | this4now! | Username is required                                   |
      #|                     |           | Username and password is required                      |
#
  #@regression
  #Scenario Outline: Login with valid Credentials without user role
    #When I enter Username as "<username>" and Password as "<password>"
    #And I click login button
    #Then Package Subscription page is open
#
    #Examples:
      #| username          | password  |
      #| nmx@digibuild.com | this4now! |
      #| nmx@digibuild.com | this4now@ |
#
  #@regression
  #Scenario Outline: Login as an owner with valid Credentials
    #When I enter Username as "<username>" and Password as "<password>"
    #And I click login button
    #Then Owner dashboard page is open
#
    #Examples:
      #| username          | password  |
      #| nmx@digibuild.com | this4now! |
      #| nmx@digibuild.com | this4now@ |
#
  #@regression
  #Scenario Outline: Login as a General contractor with valid Credentials
    #When I enter Username as "<username>" and Password as "<password>"
    #And I click login button
    #Then General Contractor dashboard page is open
#
    #Examples:
      #| username          | password  |
      #| nmx@digibuild.com | this4now! |
      #| nmx@digibuild.com | this4now@ |
#
  #@regression
  #Scenario Outline: Login as a Sub Contractor with valid Credentials
    #When I enter Username as "<username>" and Password as "<password>"
    #And I click login button
    #Then Sub Contractor dashboard page is open
#
    #Examples:
      #| username          | password  |
      #| nmx@digibuild.com | this4now! |
      #| nmx@digibuild.com | this4now@ |
#
  #@regression
  #Scenario Outline: Navigate to any page(Not public) without login
    #When I Navigate to any private page in application by hitting url
    #Then Login page is open
#
#
#
#
  #@endtoendautomation
  #Scenario Outline: Register Valid User
    #When I click the register user button
    #Then Registration page is Open
    #When I enter firstName as <firstName> , last name as <lastName> , username as <username> , email as <email> , phone as <phone> , password as <password> and confirm passowrd as <confirmPassword>
    #And I click the register button
    #Then Verification Emaill will be sent to user email
#
    #Examples:
      #| firstName | lastName | username |    email    | phone  | password | confirmPassword |
      #| abc       | xyz      | abc124   | abc@123.com | 123456 | ***      | ***             |
#
#
  #@endtoendautomation
  #Scenario Outline: Register user with invalid data
    #When I click the register user button
    #Then Registration page is Open
    #When I enter firstName as <firstName> , last name as <lastName> , username as <username> , email as <email> , phone as <phone> , password as <password> and confirm passowrd as <confirmPassword>
    #And I click the register button
    #Then error message <errorMessage> will be displayed on screen
    #Examples:
      #| firstName | lastName | username |    email    | phone  | password | confirmPassword |           errorMessage           |
      #|           | xyz      | abc124   | abc@123.com | 123456 | ***      | ***             | First name is required           |
      #| abc       |          | abc124   | abc@123.com | 123456 | ***      | ***             | Last name is required            |
      #| abc       | xyz      |          | abc@123.com | 123456 | ***      | ***             | Username is required             |
      #| abc       | xyz      | abc124   |             | 123456 | ***      | ***             | Email is required                |
      #| abc       | xyz      | abc124   | abc@123.com | 123456 |          | ***             | Password is required             |
      #| abc       | xyz      | abc124   | abc@123.com | 123456 | ***      |                 | Confirm Password is required     |
      #| abc       | xyz      | abc124   | abc123.com  | 123456 | ***      |                 | Email address is in wrong format |
