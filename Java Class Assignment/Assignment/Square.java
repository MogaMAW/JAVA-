public class Square extends TwoDiamentionalShape{
    // data members
    private double side;
    // constructor
    public Square(double side) {
        super(false) ;
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
}
    
