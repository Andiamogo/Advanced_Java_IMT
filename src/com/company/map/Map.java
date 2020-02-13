package com.company.map;

import java.util.ArrayList;

public class Map {
    private ArrayList<Point2D> map;

    public Map() {
        for(int i = 0; i < 9; i++) {
            for(int j =0; j < 9;i++) {
                map.add(new Point2D(i, j));
            }
        }
    }
}
