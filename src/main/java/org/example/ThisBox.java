package org.example;

// Illustration of role of this in constructor overloading
public class ThisBox {
    double width, height, depth;
    int boxNo;

    // construct used when all dimensions and boxNo specified
    ThisBox(double w, double h, double d, int num) {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }

    // construct when no dimension specified
    ThisBox() {
        // an empty box
        width = height = depth = 0;
    }

    // constr used only when boxNo specified
    ThisBox(int num) {
        // this() is used to call default constr from parametrized constructor
        this();

        boxNo = num;
    }

//    Box(int num)
//    {
//        boxNo = num;
//
//    /* Constructor call must be the first
//       statement in a constructor */
//        this();  /*ERROR*/
//    }

    public static void main(String[] args) {
        // create box using only box number
        Box box1 = new Box(1);

        // getting initial width of box1
        System.out.println(box1.width);
    }
}
