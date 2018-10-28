Feature: Register an account

  Scenario: Password confirmation wrong
    When I navigate to "/register"
    And I enter "alice" into input field having id "username"
    And I enter "alice@example.com" into input field having id "mail"
    And I enter "111111111111" into input field having id "password"
    And I enter "222222222222" into input field having id "password-repeat"
    And I click on button having text "Register"
    Then I should see form error "Given password and repeated password are not equal"

  Scenario: Already existing username
    Given User "alice" is registered
    When I navigate to "/register"
    And I enter "alice" into input field having id "username"
    And I enter "alice@example.com" into input field having id "mail"
    And I enter "111111111111" into input field having id "password"
    And I enter "111111111111" into input field having id "password-repeat"
    And I click on button having text "Register"
    Then I should see form error "This username already exists"

  Scenario: Successful registration
    When I navigate to "/register"
    And I enter "alice" into input field having id "username"
    And I enter "alice@example.com" into input field having id "mail"
    And I enter "111111111111" into input field having id "password"
    And I enter "111111111111" into input field having id "password-repeat"
    And I click on button having text "Register"
    Then I should be logged in as "alice"
