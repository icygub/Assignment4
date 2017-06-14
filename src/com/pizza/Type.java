package com.pizza;

/**
 * Created by icyhot on 07/06/2017.
 */
public enum Type {

    REGULAR("Regular"), SICILIAN("Sicilian");

    private String type;

    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
