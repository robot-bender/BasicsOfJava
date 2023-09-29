package org.example;

// example of contructor overloading
public class Box {
    double width, height, depth;

    // contructor when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // contructor when no dimension specified
    Box() { width = height = depth = 0;}

    // constructor when cube is created
    Box(double len) { width = height = depth = len;}

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
