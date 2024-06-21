package Manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/*
 * @author thaib
 */
public class ManageEastAsiaCountries {

    static Scanner in = new Scanner(System.in);
    static ArrayList<Country> lc = new ArrayList<>();

    public static int menu() {
        System.out.println("\n1. Enter the information for 11 countries in Southeast Asia.");
        System.out.println("2. Display already information.");
        System.out.println("3. Search the country according to the entered country's name.");
        System.out.println("4. Display the information increasing with the country name.");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 5);
        return choice;
    }

    // check Limit
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    // check String
    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check limit double
    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please enter double positive integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCountryNameExist(ArrayList<Country> lc, String countryName) {
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                return false;
            }
        }
        return true;
    }

    public static void inputCountry() {
        System.out.print("Enter code of contry: ");
        String countryCode = checkInputString();
        if (!checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of contry: ");
        String countryName = checkInputString();
        // Check if the country name already exists
        if (!checkCountryNameExist(lc, countryName)) {
            System.err.println("Is already on the list.");
            return;
        }
        System.out.print("Enter total area: ");
        double countryArea = checkInputDouble();
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = checkInputString();
        lc.add(new EastAsiaCountries(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
    }

    public static void printCountry() {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area", "Terrain");
        int lastIndex = lc.size() - 1; // lay ds cuoi cung
        if (lastIndex >= 0) {
            Country lastCountry = lc.get(lastIndex);
            lastCountry.display();
        } else {
            System.out.println("ArrayList is empty.");
        }
    }

    public static void printCountrySorted() {
        Collections.sort(lc);
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area", "Terrain");
        for (Country country : lc) {
            String countryName = country.getCountryName();
            country.display();
        }
    }

    public static void searchByName() {
        System.out.print("Enter the name you want to search for: ");
        String countryName = checkInputString();
        boolean found = false;

        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area", "Terrain");

        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                found = true;
                country.display();
            }
        }

        if (!found) {
            System.out.println("Country not found.");
        }
    }

}
