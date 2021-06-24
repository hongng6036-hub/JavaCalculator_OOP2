package com.tts;
public class Calculator {

    public Calculator() {
    }

    int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    int subtract(int x, int y) {
        int substract = x - y;
        return substract;
    }

    public int multiply(int x, int y) {
        int multiply = x * y;
        return multiply;
    }

    public int divide(int x, int y) {
        int divide = x / y;
        return divide;
    }

    public double square(double x, double y) {
        double square = Math.pow(x, y);
        return square;
    }

}
