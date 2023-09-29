package org.example;

// constructor chaining using this() keyword
public class Temp {
    // default constructor 1will call anither constructor using this() keyword
    Temp() {
        // calls constructor 2
        this(5);
        System.out.println("The default constructor");
    }

    // parametrized constructor 2
    public Temp(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    public Temp(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        // invokes the default constructor first
        new Temp();
    }
}
