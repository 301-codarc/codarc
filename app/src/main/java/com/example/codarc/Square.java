package com.example.codarc;

public class Square extends Shape {
    private  int side;

    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    public int area() {
        return side * side;
    }
}



