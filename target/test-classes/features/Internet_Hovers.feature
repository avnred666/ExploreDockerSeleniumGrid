Feature: Test hovers in The Internet portal
  Scenario: Test hovers
    When user clicks on Hovers link
    And user hovers over first figure
    Then the text returned is "name: user1"