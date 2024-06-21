
package Manager;



/*
 * @author thaib
 */
public class Main {
     public static void main(String[] args) {
        
        while (true) {
            int choice = ManageEastAsiaCountries.menu();
            switch (choice) {
                case 1:
                    ManageEastAsiaCountries.inputCountry();
                    break;
                case 2:
                    ManageEastAsiaCountries.printCountry();
                    break;
                case 3:
                    ManageEastAsiaCountries.searchByName();
                    break;
                case 4:
                    ManageEastAsiaCountries.printCountrySorted();
                    break;
                case 5:
                    return;
            }
        }
    }
}



