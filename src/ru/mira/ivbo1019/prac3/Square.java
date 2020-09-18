package ru.mira.ivbo1019.prac3;
import java.lang.*;
public class Square extends Rectangle {
    public Square(){}
    public Square(double side) {
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    public void setWidth(double side) {
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
    }
    public String toString() {
        return "Shape: square, side: "+this.width+" , color: "+this.color;
    }
}
