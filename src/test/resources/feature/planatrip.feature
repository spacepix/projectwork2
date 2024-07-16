Feature: Plan a trip on BKK's website BudapestGO - plan a route

  Background:
    Given I open BudapestGO
    When I accept cookies

  Scenario: Plan a trip
    When I type "Keleti pályaudvar" into departure field
    And I type "Déli pályaudvar" into destination field
    And I click on search button
    Then possible routes should be displayed