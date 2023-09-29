package org.example.lambda;

// Lambda express instances of functional interfaces (an interface with single abstract method)
public interface FuncInterface {

    // an abstract function
    void abstractFun(int x);

    // a non-abstract (or default) function
    default void normalFun() {
        System.out.println("Hello");
    }
}
