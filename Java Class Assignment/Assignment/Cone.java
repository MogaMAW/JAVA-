public class Cone extends ThreeDiamentionalShape{
    // data members
    private double radius;
    private double height;

    // constructor
    public Cone(double radius, double height) {
        super(true);
        this.radius = radius;
        this.height = height;
    }
    public double getArea() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
    public double getVolume() {
        return Math.PI * radius * radius * height / 3;
    }
}
    
