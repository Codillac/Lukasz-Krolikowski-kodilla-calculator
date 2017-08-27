package com.kalkulator;

public class Calculator {
    double firstVariable;
    double secondVariable;

    public Calculator(double firstVariable, double secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public double addNumbers() {
        return firstVariable + secondVariable;
    }

    public  double substractNumbers() {
        return firstVariable - secondVariable;
    }

    public static void main(String[] args) {
        double a = 5;
        double b = 4.5;
        Calculator calculator = new Calculator(a, b);
        double sum = calculator.addNumbers();
        double difference = calculator.substractNumbers();
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
    }
}
