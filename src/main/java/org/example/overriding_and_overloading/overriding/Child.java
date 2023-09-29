package org.example.overriding_and_overloading.overriding;

// inherited class
public class Child extends Parent {
    // this method overrides show() of Parent

    @Override
    void show() {
        System.out.println("Child's show()");
    }
}
