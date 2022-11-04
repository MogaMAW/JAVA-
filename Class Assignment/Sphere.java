package Polymorphism;

public class Sphere extends threeDimensional {
    double pie = 3.14;
    double diameter;

    public Sphere(double diameter) {
        super("Sphere");
        this.diameter = diameter;

    }

    public double getVolume() {
        double r = diameter / 2.0;
        double rs = r * r * r;
        double num = 4.0 * pie * rs;
        double volume = num / 3.0;

        return volume;
    }

    public double surfaceArea() {
        double r = diameter / 2;
        return 4.0 * pie * r * r;
    }

    public String toString() {
        return super.toString() + ". It has a volume of " + this.getVolume() + " and a surface area of "
                + this.surfaceArea();
    }

}
