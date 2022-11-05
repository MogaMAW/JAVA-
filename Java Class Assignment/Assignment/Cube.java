public class Cube extends ThreeDiamentionalShape{
    // data members
    private double side;
    // constructor
    public Cube(double side) {
        super(true);
        this.side = side;
    }
    public double getArea() {
        return 6 * side * side;
    }
    public double getVolume() {
        return side * side * side;
    }
}
