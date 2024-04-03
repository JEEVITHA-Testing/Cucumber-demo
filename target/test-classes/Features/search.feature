Feature: feature to test Search box
Scenario Outline: Users can perform a search on Google
    Given I open the Google search page
    When I search for "<search>"
    Then I should see the results page

    Examples:
        | search    |
        | Phone|
        |Testing|
        |Jeeviths|





