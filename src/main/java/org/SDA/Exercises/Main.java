package org.SDA.Exercises;

public class Main {
    public static void main(String[] args) {

        BoxedNumber boxedNumber = new BoxedNumber(5.0);

        System.out.println(new BoxedNumber(5.0).add(5.0).mul(2.0).mul(5.0).div(10.0));
    }
}
