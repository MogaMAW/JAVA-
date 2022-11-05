public class Cylinder extends ThreeDiamentionalShape{
    // data members
    private double radius;
    private double height;

    // constructor
    public Cylinder(double radius, double height) {
        super(true);
        this.radius = radius;
        this.height = height;
    }
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
    

