package com.pizza;

/**
 * Created by icyhot on 07/06/2017.
 */
public enum Size {

    SMALL("Small"), MEDIUM("Medium"), LARGE("Large"), EXTRA_LARGE("Extra Large");

    private String size;

    Size(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size;
    }
}
