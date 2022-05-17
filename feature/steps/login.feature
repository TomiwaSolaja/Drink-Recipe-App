# Created by Ezeniel at 5/17/2022
Feature: login
  # User logs in, User Registration

  Scenario Outline: User Registration
    Given the user is on the registration page
    When the user types in the <Name> field
    When the user types in the <age> field
    When the user types in the <email> field
    When the user types in the <password> field
    When the user clicks on register button
    Then the user is redirected to the login page
  #user info should now be updated on database

    Examples:
      | Name     | age | email            | password |
      | customer | 100 | client@email.com | test     |


  Scenario: User Logs in
    Given the user is on the log in page
    When the user types in the userId field
    When the user types in the userPw field
    When the user clicks on the login button
    Then the user should be on the cocktail page
 #only required if selecting cocktails

  Scenario: User selects cocktail options
    Given the user is on the cocktail page
    When the user selects an image
    Then the user should be redirected to the recipe page