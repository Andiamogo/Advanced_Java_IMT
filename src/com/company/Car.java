package com.company;

import com.company.map.Point2D;

import java.awt.*;
import java.util.List;

public class Car {
    Point2D position;
    Point2D previous_movement;
    int amount_movements = 0;

    public Car(int x, int y){
        this.position = new Point2D(x, y);
        this.previous_movement = new Point2D(0, 0);
    }

    public int getX() {
        return this.position.x;
    }

    public int getY() {
        return this.position.y;
    }

    public int getAmount_movements() {
        return this.amount_movements;
    }

    public void move(int x, int y){

        if(this.amount_movements != 0){

            int expected_x = this.previous_movement.x + this.position.x;
            int expected_y = this.previous_movement.y + this.position.y;

            if(((x - expected_x <= 1) && (x - expected_x >= -1)) && ((y - expected_y <= 1) && (y - expected_y >= -1))){
                moveDaCar(x, y);
                System.out.println("Déplacement OK");
            }
            else System.out.println("Déplacement NOK");
        }
        else{
            moveDaCar(x, y);
        }
    }

    private void moveDaCar(int x, int y){
        this.amount_movements++;
        this.previous_movement = new Point2D(x - this.position.x, y - this.position.y);
        this.position = new Point2D(x, y);
    }
}
