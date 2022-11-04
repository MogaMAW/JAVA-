package Polymorphism;

public class Testing {

    public static void main(String[] args) {

        Shape circle, cube, triangle, sphere, square, tetrahedron;

        circle = new Circle(24.2);
        cube = new Cube(4);
        triangle = new Triangle(24, 4);
        sphere = new Sphere(24.0);
        square = new Square(10);
        tetrahedron = new Tetrahedron(4);

        Shape[] myShapes = { circle, cube, triangle, sphere, square, tetrahedron };

        for (Shape shapes : myShapes) {
            System.out.println(shapes);
        }

    }

}
