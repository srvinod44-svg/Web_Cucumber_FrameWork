package org.example.StepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.Map;

public class CartSteps {


    @Given("the product price is {int}")
    public void the_product_price_is(Integer actual) {
        System.out.println("actual :" +actual);

    }
    @When("a discount of {double} is applied")
    public void a_discount_of_is_applied(Double discount) {
        System.out.println("discount :" +discount);

    }
    @Then("final price should be {double}")
    public void final_price_should_be(Double finalPrice) {
        System.out.println("finalPrice :" +finalPrice);

    }

    @Given("user add {string} to cart")
    public void user_add_to_cart(String item) {
        System.out.println("item name is :" +item);

    }
    @When("user proceed to checkout")
    public void user_proceed_to_checkout() {
        System.out.println("user_proceed_to_checkout :");

    }
    @Then("cart should contain {string} and their price {string}")
    public void cart_should_contain_and_their_price(String item, String price) {
        System.out.println("item name is :" +item +"\n" +"price of item is :" +price);

    }


    @Given("user add following item to cart:")
    public void userAddFollowingItemToCart(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println("item name is :" +entry.getKey()  +"  and its price is :" +entry.getValue());
        }

    }

    @Then("total price should be {int}")
    public void totalPriceShouldBe(int price) {
        System.out.println("Total Price :" +price);

    }
}
