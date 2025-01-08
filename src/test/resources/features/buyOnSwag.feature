@Suite @BuyE2E
Feature: Buy on SwagLabs Website
  As an user
  I want to make a buy on SwagLabs website
  So I can see the purchase message at the end

  Background:
    Given that the user was on the website
    When attempts to login with the correct credentials
      | user          | pass         |
      | standard_user | secret_sauce |

  @Buy
  Scenario Outline: Successful purchase on the website
    When adds some products to the cart
    And checks that exactly chosen product is on the cart
    When fills the checkout personal information fields
      | firstName   | lastName   | postalCode   |
      | <firstName> | <lastName> | <postalCode> |
    And checks that exactly chosen product is on the checkout overview
    Then he will see the message <message> on screen
    Examples:
      | firstName | lastName | postalCode | message                  |
      | firstName | lastName | 12345      | THANK YOU FOR YOUR ORDER |
