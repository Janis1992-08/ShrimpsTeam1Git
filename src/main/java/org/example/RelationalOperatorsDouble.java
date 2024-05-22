package org.example;

public class RelationalOperatorsDouble {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 5.2;

        double sum = a + b;
        double dif = a - b;
        double prod = a * b;
        double quot = a / b;

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
