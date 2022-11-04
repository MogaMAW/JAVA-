package Polymorphism;

public class Circle extends twoDimensional {
    double diameter;
    double pie = 3.14;

    public Circle(double diameter) {
        super("Circle");
        this.diameter = diameter;
    }

    public double getArea() {
        double r = diameter / 2;
        double area = pie * r * r;

        return area;
    }

    public String toString() {
        return super.toString() + ". It has an area of " + this.getArea();
    }

}
