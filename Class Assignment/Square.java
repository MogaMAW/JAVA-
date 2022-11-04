package Polymorphism;

public class Square extends twoDimensional {
    int length;

    public Square(int length) {
        super("Square");
        this.length = length;
    }

    public int getArea() {
        int area = length * length;

        return area;
    }

    public String toString() {
        return super.toString() + ". It has an area of " + this.getArea();
    }

}
