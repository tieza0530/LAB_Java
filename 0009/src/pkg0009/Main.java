/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0009;

import java.util.Scanner;

/**
 *
 * @author VSIT
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();

        FibonacciArray fibonacciArray = new FibonacciArray();
        fibonacciArray.generateArray(n);
        fibonacciArray.display();

    }
}
