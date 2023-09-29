package org.example.abstract_class;

// extending abstract class
public class Easy extends Geometry {
    // implementing abstract method of abstract class
    public void rectangle_area(int height, int width) {
        int ar = height * width;
        System.out.println("Area of rectangle=" + ar);
    }

    // implementing abstract method of abstract class
    public void square_area(int side) {
        int ar = side * side;
        System.out.println("Area of square=" + ar);
    }

    // implementing abstract method of abstract class
    public void circle_area(float radius) {
        float ar = 3.14f * radius * radius;
        System.out.println("Area of circle=" + ar);
    }

    // main fuction
    public static void main(String[] args) {
        // creating instance of derived class
        Easy obj = new Easy();
        // calling abstract method
        obj.rectangle_area(12,13);
        obj.square_area(12);
        obj.circle_area(2.2f);
    }
}
