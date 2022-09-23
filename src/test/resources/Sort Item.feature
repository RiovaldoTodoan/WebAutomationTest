Feature: Filter Item
  User want to sort items

  Scenario Outline: Sort item name Z to A
    When User landing on inventory page
    And User navigate to filter icon
    And User click sort by "<Filter>"
    Then Item filtered by "<Filter>"

    Examples:
      |   Filter   |
      |Name (Z to A) |