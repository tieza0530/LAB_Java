
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC
 */
public class Function {

    static ArrayList<Person> listPerson = new ArrayList<>();

    public static void inputInfor() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Input of person");
            System.out.println("Name: ");
            String name = Validation.inputString();
            System.out.println("Address: ");
            String address = Validation.inputString();
            System.out.println("Salary: ");
            double salary = Validation.inputDouble();
            Person person = new Person(name, address, salary);
            listPerson.add(person);
        }
    }

    public static void sortPerson() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person t, Person t1) {
                return Double.compare(t.getSalary(), t1.getSalary());
            }

        });
    }

    public static void showPerson() {
        for (int i = 0; i < listPerson.size(); i++) {
            listPerson.get(i).output();
        }
    }
}
