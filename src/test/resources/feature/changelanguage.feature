Feature: Switch the language - select another language on BKK's website BudapestGO

  Background:
    Given I open BudapestGO
    When I accept cookies


  Scenario Outline: Change language
    Given the language is set to "<defaultLanguage>"
    When I change the language to "<newLanguage>"
    Then language is changed to <newLanguage>

    Examples:
      | defaultLanguage | newLanguage |
      | hungarian       | english     |
      | english         | hungarian   |
