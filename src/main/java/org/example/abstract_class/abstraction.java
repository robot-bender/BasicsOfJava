package org.example.abstract_class;

// Driver class
public class abstraction {
    // Main function
    public static void main(String[] args) {
        arithmetic_operation n = new add();
        n.printInfo();
        arithmetic_operation y = new sub();
        y.printInfo();
    }
}
