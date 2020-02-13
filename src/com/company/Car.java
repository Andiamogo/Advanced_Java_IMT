package com.company;

import com.company.map.Point2D;

import java.awt.*;
import java.util.List;

public class Car {
    Point2D point2D;

    public Car(int x, int y){
        this.point2D = new Point2D(x, y);
    }

    public int getX() {
        return this.point2D.x;
    }

    public int getY() {
        return this.point2D.y;
    }

    void move(int x, int y){
        int previous_x = getX();
        int previous_y = getY();
        this.point2D = new Point2D(previous_x + x, previous_y + y);
    }
}
