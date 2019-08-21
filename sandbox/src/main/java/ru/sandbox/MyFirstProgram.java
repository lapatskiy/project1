package ru.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Val");

<<<<<<< HEAD

        Square s = new Square(5);
        System.out.println("Distance of a square with a side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Distance of a rectangle with a side " + r.a + " and " + r.b + " = " + r.area());
=======
        double l = 5;
        System.out.println("Distance of a square with a side " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Distance of a rectangle with a side " + a + " and " + b + " = " + area(a, b));


>>>>>>> parent of 396e152... Added test annotation
    }

    private static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
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
