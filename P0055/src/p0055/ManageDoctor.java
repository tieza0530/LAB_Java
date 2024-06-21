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
public class ManageDoctor {
    
    static ArrayList<Doctor> dl = new ArrayList<>();
    
    public static int menuDisplay() {
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
        // input
        int choice = CheckValid.CheckIntputIntLimit(1, 5);
        return choice;
    }
    
    public static void addDoctor() {
        String codeDoctor;
        while (true) {
            System.out.print("Enter Code: ");
            codeDoctor = CheckValid.getString();
            // Check exxit
            if (CheckValid.CheckCodeDoctorDuplicate(dl, codeDoctor)) {
                break;
            } else {
                System.out.print("code ton tai");
            }
        }
        System.out.print("Enter Name: ");
        String name = CheckValid.getString();
        System.out.print("Enter Specialization: ");
        String Spec = CheckValid.getString();
        System.out.print("Enter Availability: ");
        int Avai = CheckValid.getAvailability();
        
        dl.add(new Doctor(codeDoctor, name, Spec, Avai));
        System.out.println("Add successful.");
    }
    
    public static void updateDoctor() {
        System.out.print("Enter Code: ");
        String codeUpdateDoctor = CheckValid.getString();
        Doctor doctorToUpdate = getCodeByDoctor(codeUpdateDoctor);
        
        if (doctorToUpdate == null) {
            System.out.println("Doctor not found.");
            return;
        }
        System.out.print("Enter Name: ");
        String nameUpdate = CheckValid.getStringU();
        if (!nameUpdate.equals("")) {
            doctorToUpdate.setNameDoctor(nameUpdate);
        }
        System.out.print("Enter Specialization: ");
        String specializationUpdate = CheckValid.getStringU();
        if (!specializationUpdate.equals("")) {
            doctorToUpdate.setSpecialization(specializationUpdate);
        }
        System.out.print("Enter Availability: ");
        int availabilityUpdate = CheckValid.getAvailabilityUpdate();
            
        System.out.println("Doctor updated successfully.");
        return;
    }
    
    public static Doctor getCodeByDoctor(String codeDoctor) {
//        codeDelete = CheckValid.checkInputString();
        for (Doctor i : dl) {
            if (i.getCodeDoctor().equalsIgnoreCase(codeDoctor)) {
                return i;
            }
        }
        return null;
    }
    
    public static void deleteDoctor() {
        System.out.print("Enter code: ");
        String codeDelete = CheckValid.getString();
        Doctor doctor = getCodeByDoctor(codeDelete);
        if (doctor == null) {
            System.out.println("not found");
            
        } else {
            dl.remove(doctor);
            System.out.println("Deleted successful.");
        }
    }
    
    public static void searchDoctor() {
        System.out.print("Enter name: ");
        String nameSearch = CheckValid.getString();
        for (Doctor i : dl) {
            if (i.getNameDoctor().equalsIgnoreCase(nameSearch)) {
                System.out.println("Code: " + i.getCodeDoctor() + "\n Name: " + i.getNameDoctor() + "\n Specialization: " + i.getSpecialization() + "\n Availabilty: " + i.getAvailability());
            } else {
                System.out.println("not found");
            }
        }
    }
}
