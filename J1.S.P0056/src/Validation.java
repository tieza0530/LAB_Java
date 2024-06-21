
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Long1
 */
public class Validation {

    Scanner sc = new Scanner(System.in);

    public int inputInt(String msg, int min, int max) {
        System.out.println(msg);
        while (true) {
            String input = sc.nextLine();
            try {
                int result = Integer.parseInt(input);
                if (result < min || result > max) {
                    System.out.print("Please input from " + min + " to " + max + " : ");
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input an integer number: ");
            }
        }
    }

    public double inputSalary(String msg) {
        System.out.println(msg);
        double result = 0;
        while (result <= 0) {
            String input = sc.nextLine();
            try {
                result = Double.parseDouble(input);
                if(result <= 0){
                    System.out.println("Salary must > 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input number: ");
            }
        }
        return result;
    }

    public String inputString(String msg) {
        System.out.println(msg);
        while (true) {
            String result = sc.nextLine();
            if (result.trim().isEmpty()) {
                System.out.println("Please input a non-empty string: ");
                continue;
            }
            return result;
        }
    }

//Code nhập tuổi và xử lí.
    public int inputAge(String msg) {
        System.out.println(msg);
        int result = 0;
        do {
            String input = sc.nextLine();
            try {
                result = Integer.parseInt(input);
                if (result < 18 || result > 50) {
                    System.out.println("Invalid age! Age must be from 18 to 50.");
                    System.out.println(msg);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input an integer number: ");
            }
        } while (result < 18 || result > 50);
        return result;
    }

    public static boolean CheckCodeDuplicate(ArrayList<Worker> id, String code){
        for (Worker worker : id){
            if(code.equalsIgnoreCase(worker.getCode())){
                return false;
            }
        }
        return true;
    }
    
    public Worker getWorkerByCode(ArrayList<Worker> id, String code) {
        for (Worker worker : id) {
            if (code.equalsIgnoreCase(worker.getCode())) {
                return worker;
            }
        }
        return null;
    }

    public String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }
    
    public void printHistory(SalaryHistory history) {
        System.out.printf("%-10s%-15s%-15d%-15.1f%-15s%-15s\n", history.getCode(),
                history.getName(), history.getAge(), history.getSalary(),
                history.getStatus(), history.getDate());
    }
}
