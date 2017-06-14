package com.pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Toppings> toppings = new ArrayList<>();
        String name = "";
        String type = "";
        String size = "";
        int numToppings = 0;
        Size s;
        Type t;

        System.out.print("Name: ");
        sc.next();

        System.out.println("Type: ");
        sc.next();
        t = Type.valueOf(type);

        System.out.println("Size: ");
        sc.next();

        System.out.println("Number of toppings: ");
        sc.nextInt();

        //if(type )

        for(int i = 0; i < numToppings; i++) {
            System.out.println("Topping: ");
            String tp = sc.next();
            toppings.add(Toppings.valueOf(tp));
        }
        s = Size.valueOf(size);


        Pizza pizza = new Regular(s, t, toppings, 10.00);
    }
}
