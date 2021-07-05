Feature: Search Functionality

  User should be able to Search cars of all makes and models available

  @Sanity
  Scenario Outline: As a user I should be able to Search and Buy cars

    Given I am on Homepage
    And I mouse hover on buy+sell tab
    When I click on Search cars tab
    Then I should navigate and see "New & Used Car Search - carsguide" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<Price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>"in results

    Examples:
      | make       | model   | location               | Price    |
      | Audi       | A3      | NSW - Central Coast    | $200,000 |
      | BMW        | 116I    | NSW - Central West     | $100,000 |
      | Hyundai    | Tucson  | QLD - Brisbane         | $150,000 |
      | Nissan     | X-Trail | NT - North             | $90,000  |
      | Mitsubishi | ASX     | SA - Eyre Peninsula    | $80,000  |
      | Toyota     | Avensis | VIC - Central Victoria | $70,000  |

