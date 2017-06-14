package com.pizza;

/**
 * Created by icyhot on 07/06/2017.
 */
public enum Toppings {

    PEPPERONI("Pepperoni"), CHEESE("Cheese"), BACON("Bacon"), SAUSAGE("Sausage"), GUMMY_BEARS("Gummy Bears");

    String topping;

    Toppings(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return topping;
    }
}
