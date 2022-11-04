package Polymorphism;

public class Triangle extends twoDimensional {

    int base;
    int height;

    public Triangle(int base, int height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    public int getArea() {
        int area = (base * height) / 2;

        return area;
    }

    public String toString() {
        return super.toString() + ". It has an area of " + this.getArea();
    }

}
