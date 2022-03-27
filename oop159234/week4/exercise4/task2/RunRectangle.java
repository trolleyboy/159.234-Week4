package oop159234.week4.exercise4.task2;

public class RunRectangle {
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 5);
        double rectanglePerimeter = rectangle1.getPerimeter();
        double rectangleArea = rectangle1.getArea();

        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);
        System.out.println("Rectangle Area: " + rectangleArea);

    }

}
