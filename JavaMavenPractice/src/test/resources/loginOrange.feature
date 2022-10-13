Feature: Login into orangeHRM site

  Scenario Outline: Login into orangeHRM page
    Given edge brwser is open
    And open orangeHRM is loaded
    Then login into the account with <Username> and <Password>
    And verify employee list page is displayed
    Examples:
    |Username|Password|
    |Admin   |admin123|