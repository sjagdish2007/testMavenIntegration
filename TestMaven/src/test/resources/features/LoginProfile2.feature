@LoginProfile
Feature: Login Profile123
  As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Scenario: Failed login using wrong credentials
    Given I am on the "Company home" page on URL "https://register.freecrm.com/register/"
    When I fill in "abc" with "xyz"
    Then I should see "XYZ" message