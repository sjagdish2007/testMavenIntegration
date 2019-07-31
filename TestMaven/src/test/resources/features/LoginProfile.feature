@LoginProfile
Feature: Login Profile
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Scenario: Successful login
    Given I am on the "Company home" page on URL "https://www.msn.com"
    When I fill in "abc" with "xyz"
    Then I should see "XYZ" message
 