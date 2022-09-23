Feature: Cart
  Validate function of cart

 Scenario: Adding an item to cart
    Given User already login
    When User select an item
    And User click add to cart button
    And User click cart icon button
    Then Item added to cart

  Scenario: Remove an item from cart
     Given Item added in cart
     When User navigate to an item
     And User click remove button
     Then Item removed from cart

  Scenario: Continue Shopping after remove item on chart
    Given Item deleted from cart
    When User click continue shopping
    Then User landing to inventory page
