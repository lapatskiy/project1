package ru.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Val");

        double l = 5;
        System.out.println("Distance of a square with a side " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Distance of a rectangle with a side " + a + " and " + b + " = " + area(a, b));


    }

    public static void hello (String somebody) {
        System.out.println("hello, " + somebody + "!");
    }
    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}
