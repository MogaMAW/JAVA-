public class Rectange extends TwoDiamentionalShape{
    private double length;
    private double width;

    public Rectange(double length, double width) {
        super(false) ;
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}

