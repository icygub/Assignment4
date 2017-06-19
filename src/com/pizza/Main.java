package com.pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String type;
        String size;
        double price;
        int numPizzas;
        ArrayList<String> toppings = new ArrayList<>();
        Pizzaria pizzaria = new Pizzaria();

        System.out.print("Your name: ");
        name = sc.next();

        System.out.print("How many pizzas do you want? ");
        numPizzas = sc.nextInt();
        for(int i = 0; i < numPizzas; i++) {
            System.out.printf("Pizza #%d%n", i + 1);
            while(true) {
                while(true) {
                    System.out.print("What type of pizza?: ");
                    type = sc.next();
                    if(type.equalsIgnoreCase("regular") ||
                            type.equalsIgnoreCase("sicilian"))
                        break;
                }

                while(true) {
                    System.out.println("Size of the pizza: ");
                    size = sc.next();
                    if (size.equalsIgnoreCase("SM")) {
                        price = 5.00;
                        break;
                    } else if (size.equalsIgnoreCase("MD")) {
                        price = 10.00;
                        break;
                    } else if (size.equalsIgnoreCase("LG")){
                        price = 15.00;
                        break;
                    } else if(size.equalsIgnoreCase("XL")) {
                        price = 20.00;
                        break;
                    } else
                        System.out.println("Invalid option.");
                }
                int limit;
                if(type.equalsIgnoreCase("regular"))
                    limit = 4;
                else
                    limit = 2;

                System.out.printf("What toppings? Up to %d:%n", limit);
                for(int x = 0; x < limit; x++) {
                    System.out.print("> ");
                    String topping = sc.next();
                    if(topping.equalsIgnoreCase("done"))
                        break;
                    else
                        toppings.add(topping);
                }
                break;
            }
            if(type.equalsIgnoreCase("sicilian")) {
                pizzaria.add(new Sicilian(size, type, toppings, price));
            }
            else
                pizzaria.add(new Regular(size, type, toppings, price));

        }
    }
}
