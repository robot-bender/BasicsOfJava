package org.example.overriding_and_overloading.overloading;

// overloading - the same name but different signature
public class Sum {
    // overloaded sum() with two parameters
    public int sum(int x, int y) {return (x+y);}

    // overloaded sum() with two parameters
    public int sum(int x, int y, int z) {
        return (x+y+z);
    }

    // overloaded sum() with two double parameters
    public double sum(double x, double y) {
        return (x+y);
    }

    // driver code
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.5, 20.5));
    }

}
