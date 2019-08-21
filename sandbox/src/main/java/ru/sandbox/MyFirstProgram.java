package ru.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Val");


        Square s = new Square(5);
        System.out.println("Distance of a square with a side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Distance of a rectangle with a side " + r.a + " and " + r.b + " = " + r.area());
    }

    private static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area(Rectangle r) {
        return r.a * r.b;
    }
}