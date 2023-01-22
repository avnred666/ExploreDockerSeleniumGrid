Feature: Test basic authentication of The Internet portal
  Scenario: Test basic authentication
    Given user launches website
    And user clicks on Basic Auth link
    And user enters username and password
    Then user sees the message "Congratulations! You must have the proper credentials."