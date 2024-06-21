/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package P0055;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {      
        while (true) {
            int choice = ManageDoctor.menuDisplay();
            switch (choice) {
                case 1:
                    ManageDoctor.addDoctor();
                    break;
                case 2:
                    ManageDoctor.updateDoctor();
                    break;
                case 3:
                    ManageDoctor.deleteDoctor();
                    break;
                case 4:
                    ManageDoctor.searchDoctor();
                    break;
                case 5:
                    return;

            }
        }
    }
}
