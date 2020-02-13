package com.company;


import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        Car lambo = new Car(-2,-6);
        lambo.move(3,4);
        System.out.println("x : " + lambo.getX() + " ||| y : " + lambo.getY());
    }
}
