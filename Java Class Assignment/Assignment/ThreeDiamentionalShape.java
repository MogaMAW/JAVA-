
public abstract class ThreeDiamentionalShape extends Shapes {
    public ThreeDiamentionalShape(boolean is3d) {
        super(is3d);
    }
    public abstract double getArea();
    public abstract double getVolume();
    public void printType() {
        System.out.println("I am a 3D shape");
    }
}
