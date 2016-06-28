package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/28.
 */
public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(6.2);
        System.out.println("area:" + square.getArea());
        System.out.println("perimeter:" + square.getPerimeter() );
        Rectangle rectangle = new Rectangle(2.2,3.3);
        System.out.println("area:" + rectangle.getArea());
        System.out.println("perimeter:" + rectangle.getPerimeter() );
        Triangle triangle = new Triangle(5.1,5.5,5.2);
        System.out.println("area:" + triangle.getArea());
        System.out.println("perimeter:" + triangle.getPerimeter() );
        Circle circle = new Circle(3.3);
        System.out.println("area:" + circle.getArea());
        System.out.println("perimeter:" + circle.getPerimeter() );
    }
}
