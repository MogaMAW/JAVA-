public class Sphere extends ThreeDiamentionalShape{
    private double radius;
    public Sphere(double radius) {
        super(true);
        this.radius = radius;
    }
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
    public double getVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}
    

