package com.company;

import java.util.List;

public class Car {
    int x, y;

    public Car(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void move(int x, int y){
        this.x += x;
        this.y += y;
    }
}
