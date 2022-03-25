package com.mjs8071;

public class Gum extends Item {


    public Gum(String name, double price) {
        super(name, price);
    }

    @Override
    public String printMessage() {
        return "Chew Chew, Yum!";
    }
}
