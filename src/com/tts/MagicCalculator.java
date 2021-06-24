package com.tts;


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