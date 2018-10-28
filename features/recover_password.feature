Feature: Recover forgotten password
    
    Scenario: User doesn't exist
        When I navigate to "/login"
        Then link having text "Forgot password" should be present
        When I click on link having text "Forgot password"
        Then I should see page title as "Password Reset"
        When I enter "alice@example.com" into input field having id "mail"
        And I click on button "Recover"
        Then I should see a message "A password reset link was sent to the given address"

    Scenario: Recovery successful
        Given User "alice" is registered
        When I navigate to "/login"
        Then link having text "Forgot password" should be present
        When I click on link having text "Forgot password"
        Then I should see page title as "Password Rest"
        When I enter "alice@example.com" into input field having id "mail"
        And I click on button "Recover"
        Then message having text "A password reset link was sent to the given address" should be present
        When I check my mails at "example.com"
        Then mail from "reset@turnie.re" should be present
        When I open the latest mail from "reset@turnie.re"
        Then link having text "Click here to reset your password" should be present
        When I click on link having text "Click here to reset your password"
        And I enter "333333333333" into input field having id "password"
        And I enter "333333333333" into input field having id "password-repeat"
        And I click on button "Set password"
        Then message having text "The new password has been saved" should be present
