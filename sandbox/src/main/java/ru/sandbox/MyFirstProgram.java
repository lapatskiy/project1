package ru.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Val");

<<<<<<< HEAD
<<<<<<< HEAD
        Square s = new Square(5);

        System.out.println("Distance of a square with a side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);


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


    }

    public static void hello (String somebody) {
        System.out.println("hello, " + somebody + "!");
    }
<<<<<<< HEAD
    public static double area(double len) {
        return len * len;
    }
>>>>>>> parent of 4120dcd... Revert "Added additional functions"

    public static double area(double a, double b) {
        return a * b;
    }
<<<<<<< HEAD

    public static void hello (String somebody) {
        System.out.println("hello, " + somebody + "!");
    }


=======
>>>>>>> parent of 4120dcd... Revert "Added additional functions"
=======


>>>>>>> parent of 7217d9f... Revert "Added test annotation"
}
