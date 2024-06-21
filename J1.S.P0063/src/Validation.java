
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class Validation {

    static Scanner sc = new Scanner(System.in);

    public static double inputDouble() {
        double result = 0.0;
        while (true) {
            try {              
                result = Double.parseDouble(sc.nextLine().trim());
                if (result > 0) {
                    break;
                }
                System.err.println("Slary is greater than zero");
            } catch (NumberFormatException e) {
                System.err.println("Please must input digidt.");
            }
        }
        return result;
    }

    public static String inputString() {
        String result = "";
        while (true) {           
            result = sc.nextLine().trim();
            if (!result.equals("")) {
                break;
            }
            System.err.println("Please must input not empty");
        }
        return result;
    }

}
