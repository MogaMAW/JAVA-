import java.text.DecimalFormat;

public class Shapes {
   // boolean value to checck if the shape is 3D or not
    private boolean is3D;
    // constructor
    public Shapes(boolean is3D) {
        this.is3D = is3D;
    }
    public void type(){
        DecimalFormat df = new DecimalFormat("0.00");
    if (is3D == true) {
        printType();
        // print the volume
        System.out.println("Volume: " + df.format(getVolume()));
        // print the area
        System.out.println("My area is: " + df.format(getArea()));
    } else {
        printType();
        // print the area
        System.out.println("My area is: " + df.format(getArea()));
    }
    }
    public double getArea() {
        return 0;
    }

    public double getVolume() {
        return 0;
    }

    public void printType() {
    }

}