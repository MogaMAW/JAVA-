package Polymorphism;

public class Cube extends threeDimensional {
    int a;

    public Cube(int length) {
        super("Cube");
        a = length;
    }

    public int getVolume() {
        return a * a * a;
    }

    public int surfaceArea() {
        return 6 * (a * a);
    }

    public String toString() {
        return super.toString() + ". It has a volume of " + this.getVolume() + " and a surface Area of "
                + this.surfaceArea();
    }

}
