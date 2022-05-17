# Created by Ezeniel at 5/17/2022
Feature: User Main Page
  # user main page menu options

  Scenario: User is on the Main page
   Given The user is on the menu page
    When a user selects a category
    Then a user should be redirected to the options page
  #available categories are [ smoothies, cocktails, vegan drinks, kids drinks ]

  Scenario: User is on the options page
    Given The user is on the options page
    When user selects an image
    Then user should be redirected to the recipe page

  Scenario: user selects cocktails
    Given the user is on the menu page
    When the user selects <cocktails>
    Then the user is redirected to the login page


  Scenario: Top rated drinks
    Given the user is on the menu page
    When the user selects a top rated drink image
    Then the user is redirected to the recipe

  #optional implementations may include ratings on the recipe page