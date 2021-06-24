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

class MagicCalculator extends Calculator {
    double magicSquare(double x, double y) {
        double magicSquare = Math.pow(x, y);
        return magicSquare;
    }

    double magicSine(double degrees) {
        double radians = Math.toRadians(degrees);
        double magicSine = Math.sin(radians);
        return magicSine;
    }

    double magicCosine (double degrees) {
        double radians = Math.toRadians(degrees);
        double magicCosine = Math.cos(radians);
        return magicCosine;
    }

    double magicTangent (double degrees) {
        double radians = Math.toRadians(degrees);
        double magicTangent = Math.tan(radians);
        return magicTangent;
    }

    //Factorial method = 5! = 5 * (4 * 3 * 2 * 1) = 120
    // we want to stop at 1 when calculating factorials

    int magicFactorial (int n) {
        if ( n == 1){
            return 1;
        } else {
            return n * magicFactorial(n-1);
        }
    }




}