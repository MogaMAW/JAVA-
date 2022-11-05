public abstract class TwoDiamentionalShape extends Shapes {
    public TwoDiamentionalShape(boolean is3d) {
        super(is3d);
    }
    public abstract double getArea();
    public void printType() {
        System.out.println("I am a 2D shape");
    }
    
}