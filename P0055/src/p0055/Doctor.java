/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0055;

/**
 *
 * @author admin
 */
public class Doctor {
   String codeDoctor;
   String nameDoctor;
   String specialization;
   int availability;

    public Doctor() {
    }

    public Doctor(String codeDoctor, String nameDoctor, String specialization, int availability) {
        this.codeDoctor = codeDoctor;
        this.nameDoctor = nameDoctor;
        this.specialization = specialization;
        this.availability = availability;
    }
    
    public String getCodeDoctor() {
        return codeDoctor;
    }

    public void setCodeDoctor(String codeDoctor) {
        this.codeDoctor = codeDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    
   
    
}
