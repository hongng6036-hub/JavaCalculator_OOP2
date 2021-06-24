package com.tts;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("==========Basic Calculator =========");
        //Basic Calculator
            Calculator sum = new Calculator();
            Calculator substract = new Calculator();
            Calculator multiply = new Calculator();
            Calculator divide = new Calculator();
            Calculator square = new Calculator();

        System.out.println("Sum is "+sum.add(5,6));
        System.out.println("Subtraction result is: "+substract.subtract(7,6));
        System.out.println("Product is: "+multiply.multiply(5,6));
        System.out.println("Division result is : "+divide.divide(30,6));
        System.out.println("Square result is: "+square.square(4,2));


    //Magic Calculator
        System.out.println("\n========== Magic Calculator ===========");
        MagicCalculator magicSquare = new MagicCalculator();
        MagicCalculator magicSin = new MagicCalculator();
        MagicCalculator magicCos = new MagicCalculator();
        MagicCalculator magicTan = new MagicCalculator();
        MagicCalculator magicFact = new MagicCalculator();


        System.out.println("Square is: " + magicSquare.magicSquare(2,3));
        System.out.println("Sin is: " + (magicSin.magicSine(30)));
        System.out.println("Cos is: " + (magicCos.magicCosine(45)));
        System.out.println("Tan is: " + (magicTan.magicTangent(60)));
        System.out.println("Factorial is: " + (magicFact.magicFactorial(5)));
    }
}
