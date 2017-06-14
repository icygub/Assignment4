package com.pizza;

import java.util.ArrayList;

/**
 * Created by icyhot on 07/06/2017.
 */
public abstract class Pizza implements Comparable {

    private Size size;
    private Type type;
    private ArrayList<Toppings> toppings;
    private double cost;

    public Pizza(Size size, Type type, ArrayList<Toppings> toppings, double cost) {
        this.size = size;
        this.type = type;
        this.toppings = toppings;
        this.cost = cost;
    }


}
