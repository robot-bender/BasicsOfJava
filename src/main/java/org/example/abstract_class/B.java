package org.example.abstract_class;

// concrete class B
public class B extends A {
    // class B must override m1() method
    // otherwise, compile-time
    // exception will be thrown

    @Override
    void m1() {
        System.out.println("B's "
                + "implementation of m1.");
    }
}
