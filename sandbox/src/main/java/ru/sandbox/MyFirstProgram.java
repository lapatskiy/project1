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

        double l = 5;
        System.out.println("Distance of a square with a side " + l + " = " + s.area());
        Square s = new Square(5);

        System.out.println("Distance of a square with a side " + s.l + " = " + s.area());
    }
}
