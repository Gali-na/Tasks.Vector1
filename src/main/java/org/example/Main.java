package org.example;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(3, 4, 6);
        Vector vector2 = new Vector(1, 2, 3);
        System.out.println(vector1.vectorAddition(vector2));
        System.out.println(vector1.scalarVectorMultiplication(vector2));
        System.out.println(vector1.vectorVectorMultiplication(vector2));
    }
}
