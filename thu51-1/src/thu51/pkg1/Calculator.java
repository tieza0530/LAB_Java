/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thu51.pkg1;

/**
 *
 * @author VSIT
 */
import java.util.Scanner;

public class Calculator {

    private double memory;

    public Calculator() {
        this.memory = 0.0;
    }

    public void setInputNumber() {
        System.out.print("Enter number: ");
        double number = Validation.checkInputDouble();
        memory = number;
    }

    public void performOperation(String operator) {
        switch (operator) {
            case "+":
                memory += inputNumber();
                break;
            case "-":
                memory -= inputNumber();
                break;
            case "*":
                memory *= inputNumber();
                break;
            case "/":
                while (true) {
                    double divisor = inputNumber();
                    if (divisor == 0)                         
                        System.out.println("Error: Cannot divide by zero.");
                    else {
                        memory /= divisor;
                        break;
                    }
                    
                }
                break;
            case "^":
                memory = Math.pow(memory, inputNumber());
                break;
            case "=":
                break;
        }
        System.out.println("Memory: " + memory);
    }

    public void diplayResult() {
        System.out.println("Result: " + memory);
    }

    private double inputNumber() {
        System.out.print("Enter number: ");
        return Validation.checkInputDouble();
    }

}
