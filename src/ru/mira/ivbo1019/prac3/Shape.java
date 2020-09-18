package ru.mira.ivbo1019.prac3;
import java.lang.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape(String color, boolean filled){}
    public String getColor(){
        return color;
    }
    public void setColor(String Color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimetr();
    public String toString(){
        return " This is abstract class";
    }
}

