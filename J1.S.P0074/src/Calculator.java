
/**
 *
 * @author Dinhsu
 */
public class Calculator {

    static int[][] getAddAndSubResult(int[][] matrix1, int[][] matrix2, int mode) {

        int result[][] = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                if (mode == 1) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                } else if (mode == 2) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return result;
    }



    static void addAndSubMatrix(int mode) {
        int matrix1[][] = Validation.getMatrix1();
        int matrix2[][] = Validation.getMatrix2(matrix1.length, matrix1[0].length);
        System.out.println("========Result========");
        Validation.printMatrix(matrix1);
        if (mode == 1) {
            System.out.println("+");
        } else if (mode == 2) {
            System.out.println("-");
        }
        Validation.printMatrix(matrix2);
        int result[][] = getAddAndSubResult(matrix1, matrix2, mode);
        System.out.println("=");
        Validation.printMatrix(result);

    }

    static int[][] getMultiResult(int[][] matrix1, int[][] matrix2) {
        int result[][] = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                    
                }
            }
        }
        return result;
    }

    static void multiMatrix() {
        int matrix1[][] = Validation.getMatrix1();
        int matrix2[][] = Validation.getMatrixMulti(matrix1[0].length);
        int result[][] = getMultiResult(matrix1, matrix2);
        System.out.println("========Result========");
        Validation.printMatrix(matrix1);
        System.out.println("*");
        Validation.printMatrix(matrix2);
        System.out.println("=");
        Validation.printMatrix(result);
    }

}
