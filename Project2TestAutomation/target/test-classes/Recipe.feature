Feature: Recipes De Beber Supports many drink categories

  Scenario: The Vegan recipe Page Works
    Given The User is on the Recipes De Beber Homepage
    When The User clicks on Vegan drinks
    Then The User should be on the Vegan Category page
    When The User selects a Recipe
    Then The User should be on the Recipe Page

  Scenario: The Cocktails Category Works
    Given The User is on the Recipes De Beber Homepage
    When The User clicks on Cocktails
    Then The User should be on the Login page
    Then If they are an existing User, they can Login using their Email address and Password
    When The User Logs in
    Then The User should be on the Cocktails Category page
