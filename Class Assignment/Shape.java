package Polymorphism;

public class Shape {
    int numberOfDimensions;
    String shapeName;

    public Shape(int numberOfDimensions, String shapeName) {
        this.numberOfDimensions = numberOfDimensions;
        this.shapeName = shapeName;
    }

    public void typeOfShape() {
        if (this.numberOfDimensions == 2) {
            System.out.println("This is a two dimensional shape!");
        } else if (this.numberOfDimensions == 3) {
            System.out.println("This a three dimensional shape!");
        } else {
            System.out.println("Which type of shape is that!?");
        }
    }

    public String toString() {
        if (numberOfDimensions == 2) {
            return "This is a " + shapeName + " and it is a two dimensional shape";
        } else if (numberOfDimensions == 3) {
            return "This is a " + shapeName + " and it is a three dimensional shape";
        } else {
            return "This is a " + shapeName
                    + ", however I have no idea where it falls. Is it three dimensional or two dimensional shape?";
        }
    }
}
