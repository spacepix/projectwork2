Feature: Check for a route - use BKK's website to get a list of possible travel options for a specific address

  Background:
    Given I open BKK's website
    When I accept cookies

  Scenario:Look up address
    When I type "Blaha Lujza tér" into the search for lines, stops and addresses field
    Then I get a dropdown menu with all the stops and line information in that street