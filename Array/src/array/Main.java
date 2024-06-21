/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;

/**
 *
 * @author thaib
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of array: ");
        int size = Array.check();
        Array arr = new Array(size);
        arr.GetInputArray();
        arr.display();
        System.out.println("Enter search value: ");
        int search = Array.check();
        ArrayList result = arr.LinearSearch(search);
        if (result != null && result.size() > 0) {
            for (int i = 0; i < result.size(); i++) {
                System.out.println("Found " + search +" that index: " + result.get(i));
            }
        } else {
            System.out.println("Not found!!");
        }
    }
}
