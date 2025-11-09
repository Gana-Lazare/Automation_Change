#First page to Automation index would be the either welcome page or
  # any page that was designed to be displayed at first
  Feature: Welcome Page  Has been refactored to display as per requirement REQ-1000

    @regression
    Scenario: As a User i would like to have the full display of the destination this
      Given user launched the Browser
      And user navigate to url
      When user Click on sign in
      Then user is redirected to sign in page