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
public class Main {
    
        static int displayMenu() {
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return Validation.checkLimit(1, 3);
    }
    public static void main(String[] args) {
      
        while (true) {
            int choice = displayMenu();
            switch (choice) {
                case 1:
                    Calculator calculator = new Calculator();
                    calculator.setInputNumber();
                    while (true) {
                        System.out.print("Enter operator: ");
                        String operator = Validation.checkInputOperator();
                        if (operator.equalsIgnoreCase("=")) {
                            calculator.diplayResult();
                            break;
                        }
                        calculator.performOperation(operator);
                    }
                    break;
                case 2:
                    BMICalculator.calculateBMI();
                    break;
                case 3:
                    return;
            }
        }
    }
}
