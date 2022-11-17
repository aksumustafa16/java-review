package com.cybertek.lambda.shape;

public class ShapeTest {
    public static void main(String[] args) {

        Drawable drawable = () -> System.out.println("Drawing a circle");
        drawable.draw();

        Drawable2 drawable2 = shape -> System.out.println("Drawing a " + shape);
        drawable2.draw("Triangle");

        Drawable3 drawable3 = (shape, name) -> System.out.println(name + " is drawing a " + shape);
        drawable3.draw("Circle","Mike");
    }
}
