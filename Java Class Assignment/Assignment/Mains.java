public class Mains { //this is function
    public static void main(String[] args) {

        Shapes shapes[] = new Shapes[8];
        shapes[0] = new Circle(5);
        shapes[7] = new Cone(5, 10); 
        shapes[5] = new Cube(5);
        shapes[6] = new Cylinder(5, 10);
        shapes[1] = new Rectange(5, 10);
        shapes[2] = new Sphere(5);
        shapes[3] = new Triangle(5, 10);
        shapes[4] = new Square(5);
        for (Shapes s : shapes) {
            s.type();

        }
}
}
