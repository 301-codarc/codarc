package com.example.codarc;

public class Hexagon extends Shape {
    private int side;

    public Hexagon(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int perimeter() {
        return 6 * side;
    }
}