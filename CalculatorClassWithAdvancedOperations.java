package com;

import java.util.Scanner;

public class CalculatorClassWithAdvancedOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers for the operation: ");
        double number1 = scanner.nextDouble();
        System.out.println("\n");
        double number2 = scanner.nextDouble();
        System.out.println("\n Enter the operation you want to perform");
        String operation = scanner.next();
        double result;

        //String operation=scanner.next();
        switch (operation) {
            case "+":
                result = addNumbers(number1, number2);
                System.out.println("Desired result is  "+result);
                break;
            case "-":
                result = subtractNumbers(number1, number2);
                System.out.println("Desired result is  "+result);
                break;
            case "*":
                result = multiplyNumbers(number1, number2);
                System.out.println("Desired result is  "+result);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Dividing number cannot be zero");
                    scanner.close();
                    return;
                }
                result = divideNumbers(number1, number2);
                System.out.println("Desired result is  "+result);
                break;
            case "sqrt":
                result = squareRoot(number1);
                System.out.println("Desired result is  "+result);
                break;
            case "!":
                result= factorialNumber(number1);
                System.out.println("Desired result is  "+result);
                break;

        };

    }
    public static double addNumbers(double num1, double num2){
        return num1+num2;
    }
    public static double subtractNumbers(double num1, double num2){
        return num1-num2;
    }
    public static double multiplyNumbers(double num1, double num2){
        return num1*num2;
    }
    public static double divideNumbers(double num1, double num2){
            return num1/num2;
    }
    public static double squareRoot(double num1)
    {
        return Math.sqrt(num1);
    }
    public static double powerFunction(double num1, double num2){
        return Math.pow(num1,num2);

    }
    public static int factorialNumber(double num1){
        int outputFactorial=1;
        if(num1==1)
            return 1;
        else if (num1<0){
            throw new IllegalArgumentException("Number of negative number is not allowed ");
        }
        else {

            for(int i=1;i<=num1;i++){
                outputFactorial=outputFactorial*i;

            }

        }
        return outputFactorial;
    }

}

