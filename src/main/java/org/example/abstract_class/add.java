package org.example.abstract_class;

public class add extends arithmetic_operation {
    // class add muss override printInfo() method
    // otherwise compile time exception will be thrown
    void printInfo() {
        int a = 3;
        int b = 4;
        System.out.println(a +b);
    }
}
