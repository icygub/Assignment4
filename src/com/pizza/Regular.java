package com.pizza;

import java.util.ArrayList;

/**
 * Created by icyhot on 07/06/2017.
 */
public class Regular extends Pizza{

    public Regular(Size size, Type type, ArrayList<Toppings> toppings, double cost) {
        super(size, type, toppings, cost);
    }



    @Override
    public int compareTo(Object o) {
        return 0;
    }
}