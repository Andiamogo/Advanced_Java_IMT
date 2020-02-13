package com.company;


import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        Car lambo = new Car(0,0);
        System.out.println("x : " + lambo.getX() + " ||| y : " + lambo.getY() + " ||| movement : " + lambo.getAmount_movements());
        lambo.move(2,2);
        System.out.println("x : " + lambo.getX() + " ||| y : " + lambo.getY() + " ||| movement : " + lambo.getAmount_movements());
        lambo.move(3,5);
        System.out.println("x : " + lambo.getX() + " ||| y : " + lambo.getY() + " ||| movement : " + lambo.getAmount_movements());
        lambo.move(4,8);
        System.out.println("x : " + lambo.getX() + " ||| y : " + lambo.getY() + " ||| movement : " + lambo.getAmount_movements());
        lambo.move(6,12);
        System.out.println("x : " + lambo.getX() + " ||| y : " + lambo.getY() + " ||| movement : " + lambo.getAmount_movements());
    }
}
