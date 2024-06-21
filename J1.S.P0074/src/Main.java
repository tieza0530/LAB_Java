
/**
 *
 * @author Dinhsu
 */

public class Main {
    public static void main(String[] args) {
        while (true) {
            int choice = Validation.menu();
            switch (choice) {
                case 1:
                    Calculator.addAndSubMatrix(1);
                    break;
                case 2:
                    Calculator.addAndSubMatrix(2);
                    break;
                case 3:
                    Calculator.multiMatrix();
                    break;
                case 4:
                    return;
            }
        }
    }
}
