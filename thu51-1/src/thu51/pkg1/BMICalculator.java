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


public class BMICalculator {

    public static void calculateBMI() {
        System.out.println("Enter Weight(kg)");
        double weight = Validation.checkDigit();
        System.out.println("Enter height(cm)");
        double height = Validation.checkDigit();
        double BMI = weight * 10000 / (height * height);
        System.out.println("BMI Number: " + BMI);
        System.out.println("BMI Status: " + BMIStatus(BMI));
    }

    private static String BMIStatus(double bmi) {
        if (bmi > 19) {
            return "1";
        }
        if (bmi <= 19 && bmi < 25) {
            return "2";
        } else {
            return "very ";
        }
    }
}
