Feature: feature to test signin page

  Scenario: Login should be successfully entered
    Given User enter the Emailid as "jeevimoni@toolfe.com"
    And User enter the password as "Otomate@123"
    When User click on the login button
    Then click on check-in button
    And click on project icon
    Then click on order icon
    And Orderno created successfully