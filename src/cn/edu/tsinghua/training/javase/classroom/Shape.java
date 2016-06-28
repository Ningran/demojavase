package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/28.
 */
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Square extends Shape{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (!((a + b) > c && (b + c) > a && (a + c) > b)){
            System.out.println("error.");
            System.exit(0);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s  = getPerimeter() / 2;
        return Math.sqrt(s * (s - a)* (s - b)* (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
class  Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}