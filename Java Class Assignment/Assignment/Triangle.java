public class Triangle extends TwoDiamentionalShape{
    // data members
    private double base;
    private double height;
    // constructor
    public Triangle(double base, double height) {
        super(false) ;
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
    

