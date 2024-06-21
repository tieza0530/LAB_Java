/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0055;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CheckValid {

    static Scanner sc = new Scanner(System.in);

   
    public static int CheckIntputIntLimit( int min, int max){
        while (true){
            try{
                int input = Integer.parseInt(sc.next());
                if (input < min || input > max){
                    throw new NumberFormatException();
                }
                return input;
            }catch(NumberFormatException e){
                System.out.println("Not valid, please import from: [" +min+"," +max+ "]" );
                System.out.println("Enter");
            }
        }
    }
    
    public static boolean CheckCodeDoctorDuplicate(ArrayList<Doctor> dl, String codeDoctor){
        for (Doctor i : dl){
            if(codeDoctor.equalsIgnoreCase(i.getCodeDoctor())){
                return false;
            }
        }
        return true;
    }
    public static int getAvailability() {
        int result = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);           
            try {
                 result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    System.err.println("Availability >= 0.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Availability must is digit.");
            }
        }
        return result;
    }
    
   public static String getString() {
        String result ;
        while (true) {
            Scanner sc = new Scanner(System.in);
            result = sc.nextLine().trim().toLowerCase();
            if (!result.isEmpty()) {
                break;
            } else {
                System.err.println("Input is the empty. Please re-enter.");
            }
        }
        return result;
    }
   
   public static String getStringU() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim().toLowerCase();
   }
   
   public static int getAvailabilityUpdate() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        try {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                // If the user pressed Enter, keep the existing availability
                return -1;
            } else {
                int availability = Integer.parseInt(input);
                // Add constraints here if needed, e.g., if (availability >= 0 && availability <= 24) {...}
                return availability;
            }
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid integer for availability.");
            System.out.print("Enter again: ");
        }
    }
   }
}


