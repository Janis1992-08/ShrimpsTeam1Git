package org.example;

public class RelationalOperatorsFloat {
    public static void main(String[] args) {
        float a = 10.5f;
        float b = 5.2f;

        float sum = a + b;
        float dif = a - b;
        float prod = a * b;
        float quot = a / b;

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

