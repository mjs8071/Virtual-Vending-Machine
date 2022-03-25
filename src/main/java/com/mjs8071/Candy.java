package com.mjs8071;

public class Candy extends Item {


    public Candy(String name, double price) {
        super(name, price);
    }

    @Override
    public String printMessage() {
        return "Munch Munch, Yum!";
    }
}
