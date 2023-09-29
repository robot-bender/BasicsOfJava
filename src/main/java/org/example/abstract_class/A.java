package org.example.abstract_class;

// abstract class
abstract class A {
    // method with no body
    abstract void m1();

    // concrete methods are still allowed
    void m2() {
        System.out.println("This is " + "a concrete method.");
    }
}
