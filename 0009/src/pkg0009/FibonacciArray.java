/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0009;

/**
 *
 * @author VSIT
 */
import java.util.Scanner;

public class FibonacciArray {
//    private int[] fibonacciArray;
//
//    public void generateFibonacciArray(int n) {
//        fibonacciArray = new int[n];
//        fibonacciArray[0] = 0;
//        fibonacciArray[1] = 1;
//
//        for (int i = 2; i < n; i++) {
//            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
//        }
//    }
//
//    public void displayFibonacciArray() {
//        for (int i = 0; i < fibonacciArray.length; i++) {
//            System.out.print(fibonacciArray[i] + " ");
//        }
//    }

    private int[] fibonacciArray;

    public void generateArray(int n) {
        fibonacciArray = new int[n];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }
    }

    public void display() {
        for (int i = 0; i < fibonacciArray.length; i++) {
            System.out.print(fibonacciArray[i]);
            if (i < fibonacciArray.length - 1) {
                System.out.print(", ");
            }
        }
    }

}
