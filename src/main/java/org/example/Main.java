package org.example;

// Driver code
public class Main {
    public static void main(String[] args) {
        // Create boxes using various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of third box
        vol = mycube.volume();
        System.out.println("Volume of mybox3 is " + vol);

    }
}