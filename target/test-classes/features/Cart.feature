@cartScenario
Feature: cart related functionality

  Scenario: Applying discount on product
    Given the product price is 100
    When a discount of 10.5 is applied
    Then final price should be 89.5

# parameterization data using Example: keyword
  @dataProvider
  Scenario Outline: Adding different items to cart
    Given user add "<item>" to cart
    When user proceed to checkout
    Then cart should contain "<item>" and their price "<price>"


    Examples:
      | item       | price  |
      | laptop     | 100000 |
      | Headphone  | 100    |
      | smartphone | 10000  |


# parameterization data using Example: keyword
  @dataTable
  Scenario: multiple item are added to cart
    Given user add following item to cart:

    |item   |   price |
    |laptop    | 100000 |
   | HeadPhone  | 100    |
   | smartPhone    | 10000   |
    |Mouse     |  10   |

    Then total price should be 110110

