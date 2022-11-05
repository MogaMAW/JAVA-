public class Circle extends TwoDiamentionalShape{ 
    private double radius;

    
    public Circle(double radius) {
        super(false) ;
        this.radius = radius;
    
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
