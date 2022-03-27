package oop159234.week4.exercise4.task2;

public class Rectangle {
    private double breadth;
    private double length;

    public Rectangle (double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double getArea() {
        return breadth * length;
    }

    public double getPerimeter() {
        return (2 * breadth) + (2 * length);
    }
}
