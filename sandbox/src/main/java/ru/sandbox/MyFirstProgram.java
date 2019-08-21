package ru.sandbox;

public class MyFirstProgram {
<<<<<<< HEAD
<<<<<<< HEAD
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Val");

<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
        Square s = new Square(5);

        System.out.println("Distance of a square with a side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);

>>>>>>> parent of 9de06f5... Brought Code to Correction

        System.out.println("Distance of a rectangle with a side " + r.a + " and " + r.b + " = " + r.area());

=======
        double l = 5;
        System.out.println("Distance of a square with a side " + l + " = " + area(l));
=======
        Square s = new Square(5);
>>>>>>> parent of 7217d9f... Revert "Added test annotation"

        System.out.println("Distance of a square with a side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);


        System.out.println("Distance of a rectangle with a side " + r.a + " and " + r.b + " = " + r.area());
=======
<<<<<<< HEAD
        double l = 5;
        System.out.println("Distance of a square with a side " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Distance of a rectangle with a side " + a + " and " + b + " = " + area(a, b));


>>>>>>> parent of 396e152... Added test annotation
=======

    public static void main(String[] args) {
        System.out.println("Hello World Testing if anything has changed");
>>>>>>> parent of cdfb7a0... Added additional functions

        System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(2 - 2);
        System.out.println(1 / 2);
        System.out.println(1.0 / 2);
        System.out.println(1 / 2.0);
        System.out.println(2.0 / 2);
        System.out.println("2" + "2");
        System.out.println("2" + 2);
        System.out.println(2 + "2");

        System.out.println((2 + 2) * 2);

<<<<<<< HEAD
    public static void hello (String somebody) {
        System.out.println("hello, " + somebody + "!");
    }
<<<<<<< HEAD
    public static double area(double len) {
        return len * len;
    }
>>>>>>> parent of 4120dcd... Revert "Added additional functions"
=======
        System.out.println("2 + 2 = " + (2 + 2));
>>>>>>> parent of cdfb7a0... Added additional functions

>>>>>>> parent of 9de06f5... Brought Code to Correction
    }
<<<<<<< HEAD
<<<<<<< HEAD

    public static void hello (String somebody) {
        System.out.println("hello, " + somebody + "!");
    }
<<<<<<< HEAD
<<<<<<< HEAD
    public static double area(Rectangle r) {
        return r.a * r.b;
    }
}
=======
    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}
>>>>>>> parent of 396e152... Added test annotation
=======


=======
>>>>>>> parent of 4120dcd... Revert "Added additional functions"
=======


>>>>>>> parent of 7217d9f... Revert "Added test annotation"
}
=======
}
>>>>>>> parent of cdfb7a0... Added additional functions
=======

    public static void main(String[] args) {
        System.out.println("Hello World Testing if anything has changed");

        System.out.println(2 + 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);
        System.out.println(2 - 2);
        System.out.println(1 / 2);
        System.out.println(1.0 / 2);
        System.out.println(1 / 2.0);
        System.out.println(2.0 / 2);
        System.out.println("2" + "2");
        System.out.println("2" + 2);
        System.out.println(2 + "2");

        System.out.println((2 + 2) * 2);

        System.out.println("2 + 2 = " + (2 + 2));

    }
}
>>>>>>> parent of cdfb7a0... Added additional functions
>>>>>>> parent of 9de06f5... Brought Code to Correction
