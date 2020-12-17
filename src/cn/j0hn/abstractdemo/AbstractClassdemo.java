package cn.j0hn.abstractdemo;

public class AbstractClassdemo {
    public static void main(String[] args) {
        Shape s = new Rect(12, 4);
        Shape c = new Circle(4);
        Shape.showArea(s);
        Shape.showPermiter(c);
    }
}

abstract class Shape {
    public abstract double getArea();

    public abstract double getPermiter();

    public static void showArea(Shape shape) {
        System.out.println(shape.getArea());
    }

    public static void showPermiter(Shape shape) {
        System.out.println(shape.getPermiter());
    }
}

class Rect extends Shape {
    double length;
    double height;

    public Rect(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getPermiter() {
        return 0;
    }
}

class Circle extends Shape {
    public static final double PI = 3.14;
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return PI * r * r;
    }

    public double getPermiter() {
        return 2 * PI * r;
    }
}