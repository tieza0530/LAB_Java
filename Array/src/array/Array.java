/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thaib
 */
public class Array {

    private int[] array;

    public Array(int size) {
        array = new int[size];
    }

    public void GetInputArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number " +(i + 1)+ " of array: " );
            array[i] = check();
        }
    }

    public void display() {
        System.out.println("The array: ");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public ArrayList LinearSearch(int target) {
        ArrayList ListResult = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                ListResult.add(i);
            }
        }
        return ListResult;
    }

    public static int check() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Input Again: ");
            }
        }
    }
}
