package Polymorphism;

import java.lang.Math;;

public class Tetrahedron extends threeDimensional {
    double root = Math.pow(3.0, 0.5);
    double a;

    public Tetrahedron(double edge) {
        super("Tetrahedron");
        a = edge;
    }

    public double getVolume() {
        double sqrt = Math.pow(2.0, 0.5);
        double mult = 6 * sqrt;
        double volume = (a * a * a) / mult;

        return volume;
    }

    public double surfaceArea() {
        double area = root * a * a;

        return area;
    }

    public String toString() {
        return super.toString() + ". It has a volume of " + this.getVolume() + " and a surface area of "
                + this.surfaceArea();
    }
}
