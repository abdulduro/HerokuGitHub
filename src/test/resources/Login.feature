
Feature: User able to login with valid credentials

Background: Implement the common steps
  Given I am on home page

#  And I click the login button


  Scenario: User successfully logs in with valid credentials

    When I enter "go2automationclass@gmail.com" and "Pass2016"
    And I click the login button
    Then I ses "Personal apps"


    Scenario Outline: User not able to logs in with invalid credentials

      When I enter "<username>" and "<password>"
      And I click the login button
      Then I ses "<text2>" apps" error message

      Examples:
        | username                     | password | text2                                |
        | go2automationclass@gmail.com | Pass2017 | There was a problem with your login. |
        | automationclass@gmail.com    | Pass2016 | There was a problem with your login. |



#  Scenario Outline: User not able to logs in with invalid credentials
#
#    Given I am on home page
#    When I enter "<username>" and "<password>"
#    And I click the login button
##    Then I ses "<text2>" apps" error message
#
#    Examples:
#      | username                     | password | text2                                |
#      | go2automationclass@gmail.com | Pass2016 | Personal apps                        |
#      | go2automationclass@gmail.com | Pass2017 | There was a problem with your login. |
#      | automationclass@gmail.com    | Pass2016 | There was a problem with your login. |



#  Scenario Outline: User not able to logs in with invalid credentials
#
#    Given I am on home page
#    When I enter "<username>" and "<password>"
#    And I click the login button
#    Then I ses apps message or invalid message
#
#
#    Examples:
#      | username | password |
#      | go2automationclass@gmail.com | Pass2016 |
#      | go2automationclass@gmail.com | Pass2017 |
#      | automationclass@gmail.com    | Pass2016 |



