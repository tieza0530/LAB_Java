
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Long1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Worker> worker = new ArrayList<>();
        ArrayList<SalaryHistory> salary = new ArrayList<>();
        Validation valid = new Validation();
        Manage mn = new Manage(); 
        while (true) {
            System.out.println("======== Worker Management =========");
            System.out.println("1. Add Worker");                  
            System.out.println("2. Up salary");                   
            System.out.println("3. Down salary");                   
            System.out.println("4. Display Information salary");                   
            System.out.println("5. Exit");                   
            int choice = valid.inputInt("Enter option: ", 1, 5);
            switch (choice) {
                case 1:
                    mn.addWorker(worker);
                    break;
                case 2:
                    mn.changeSalary(worker, salary, 1);
                    break;
                case 3:
                    mn.changeSalary(worker, salary, 2);
                    break;
                case 4:
                    mn.printListHistory(salary);
                    break;
                case 5:
                    System.out.println("See you again!");
                    System.exit(0);
                    break;
            }
        }
    }
}
