
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Dinhsu
 */
public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    static int menu() {
        System.out.println("=======Calculator Program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
        int choice = checkInputLimit(1, 4);
        return choice;
    }

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter the number in range " + min + " --> " + max);
                System.out.println("Enter again: ");
            }
        }
    }

    // kich thuoc ma tran
    public static int checkSize(String mess) {
        System.out.print(mess);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n <= 0) {
                    throw new NumberFormatException();
                } else {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter the positive number");
                System.out.println("Enter again");
            }
        }
    }


    //gia tri mot phan tu trong ma tran
    public static int checkValue(String mess) {
        System.out.print(mess);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Values of matrix must be the number");
                System.out.println("Enter again");
            }
        }
    }

    //các giá trị cho từng phần tử có kích thước đã cho
    public static int[][] getMatrix(int row, int col) {
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = checkValue("Enter Matrix [" + i + "][" + j + "]: ");
            }
        }
        return matrix;
    }

    //checkDimension kta slg hang và cot ( phu hop voi mot gia tri gioi han limit )
    public static int checkDimension(String mess, int limit, String prompt) {
        int n;
        while (true) {
            n = checkValue(mess);
            if (n == limit) {
                break;
            } else {
                System.out.println(prompt);
            }
        }
        return n;
    }

    // in ra ma tran
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }

    }

    public static int[][] getMatrix1() {
        int row1 = checkSize("Enter row matrix 1: ");
        int col1 = checkSize("Enter col matrix 1: ");
        int matrix1[][] = getMatrix(row1, col1);
        return matrix1;
    }

    public static int[][] getMatrix2(int row1, int col1) {
        int row2 = checkDimension("Enter row matrix 2: ", row1, "Row2 must equal row1");
        int col2 = checkDimension("Enter col Matrix 2: ", col1, "Col2 must equal Col1");
        int matrix2[][] = getMatrix(row2, col2);
        return matrix2;
    }

    public static int[][] getMatrixMulti(int col1) {
        int row2 = checkDimension("Enter row matrix 2: ", col1, "Row2 must equal col1");
        int col2 = checkSize("Enter col Matrix 2: ");
        int matrixMulti[][] = getMatrix(row2, col2);
        return matrixMulti;
    }

}
