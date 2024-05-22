package org.example;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;


        int sum = a + b;
        int dif = a - b;
        int prod = a * b;
        int quot = a / b;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + dif);
        System.out.println("Multiplication: " + prod);
        System.out.println("Division: " + quot);

        boolean greaterThan = a > b;
        boolean lessThan = a < b;
        boolean equalTo = a == b;

        System.out.println("Is 'a' greater than 'b'? " + greaterThan);
        System.out.println("Is 'a' less than 'b'? " + lessThan);
        System.out.println("Is 'a' equal to 'b'? " + equalTo);
    }
}

