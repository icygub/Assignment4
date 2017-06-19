package com.pizza;

import java.util.ArrayList;

/**
 * Created by icyhot on 07/06/2017.
 */
public abstract class Pizza implements Comparable {

    private String size;
    private String type;
    private ArrayList<String> toppings;
    private double cost;

    public Pizza(String size, String type, ArrayList<String> toppings, double cost) {
        this.size = size;
        this.type = type;
        this.toppings = toppings;
        this.cost = cost;
    }


}
