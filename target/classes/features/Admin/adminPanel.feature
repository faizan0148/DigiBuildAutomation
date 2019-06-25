Feature: Admin Panel
  I want to Test Admin Panel

  Background: 
    Given I am login as an admin

  #@endtoendautomation @endtoendautomation @smoke
  #Scenario: Valid Page for Admin is open
  #Then Valid Admin page is open
  #@endtoendautomation
  Scenario Outline: Create Owner Company
    Then Valid Admin page is open
    When I Click the Create new button
    Then Company Setup page is open
    And I submit the following values in create owner company
      | Company Name   | Company Type   | Address   | Phone   | Fax   | City   | State   | Country   | Zip   |
      | <Company Name> | <Company Type> | <Address> | <Phone> | <Fax> | <City> | <State> | <Country> | <Zip> |
    Then Basic Information Page will open
    When I Click the Next Button
    Then Add Participant page will be displayed
    When I click the Add New Button
    And I submit the following values for new user
      | First Name   | Last Name   | Email   | Role   |
      | <First Name> | <Last Name> | <Email> | <Role> |
    Then Participant is displayed in the list
      | email   |
      | <email> |
    When I Click the Next Button
    Then Cost Code page is displayed
    When I Add the Default Cost Codes
    And i click finish button

    Examples: 
      | Company Name     | Company Type       | Address | Phone     | Fax        | City     | State  | Country  | Zip | First Name | Last Name  | Email                    | Role     | email                    |
      | 1Owndsdsser  1 2 | Project Owner      | Bahria  | 051789465 | 4523789465 | islambad | Punjab | Pakistan | 051 | Owner      | Automation | owner1@automation.com    | Owner    | owner1@automation.com    |
      | 1GC 1 2          | General Contractor | Bahria  | 051789465 | 4523789465 | islambad | Punjab | Pakistan | 051 | GC         | Automation | gc1@automation.com       | GC       | gc1@automation.com       |
      | 1SC 1 2          | Sub Contractor     | Bahria  | 051789465 | 4523789465 | islambad | Punjab | Pakistan | 051 | SC         | Automation | sc1@automation.com       | SC       | sc1@automation.com       |
      | 1Supplier 1 2    | Supplier           | Bahria  | 051789465 | 4523789465 | islambad | Punjab | Pakistan | 051 | Supplier   | Automation | supplier1@automation.com | Supplier | supplier1@automation.com |
