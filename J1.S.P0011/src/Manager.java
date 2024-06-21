
/**
 *
 * @author Dinhsu
 */
public class Manager {

    //display menu
    public static int menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 4);
        return choice;
    }

    //display conver
    public static int displayConvert(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert form " + from + " to " + toCase1);
        System.out.println("2. Convert form " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
        int result = Validate.checkInputIntLimit(1, 2);
        return result;
    }

    public static void convertFromBinary(String binary) {
        int choice = displayConvert("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + convertBinaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertBinaryToHexa(binary));
                break;
        }
    }

    public static void convertFromDecimal(String decimal) {
        int choice = displayConvert("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + convertDecimalToBinary(decimal)
                );
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertDecimalToHexa(decimal));
                break;
        }
    }

    public static void convertFromHexa(String hexa) {
        int choice = displayConvert("hexa", "binary", "decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + convertHexaToBinary(hexa)
                );
                break;
            case 2:
                System.out.println("Decimal: " + convertHexaToDecimal(hexa));
                break;
        }
    }

    // 2 => 10 
    public static String convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            int bit = binary.charAt(binaryLength - 1 - i) - '0';
            decimal += bit * Math.pow(2, i);
        }

        return Integer.toString(decimal);
    }
    // 2 => 16 

    public static String convertBinaryToHexa(String binary) {
        String decimal = convertBinaryToDecimal(binary);
        String hexa = convertDecimalToHexa(decimal);
        return hexa;
    }

    // 16 => 10
    public static int convertHexaToDecimal(String hexadecimal) {
        int decimal = 0;
        int hexLength = hexadecimal.length();

        for (int i = 0; i < hexLength; i++) {
            char hexDigit = hexadecimal.charAt(hexLength - 1 - i);
            int digitValue = Character.isDigit(hexDigit) ? hexDigit - '0' : hexDigit - 'A' + 10;
            decimal += digitValue * Math.pow(16, i);
        }

        return decimal;
    }
    //16 -> 2

//    public static String convertHexaToBinary(String hexadecimal) {
//        String binary = Integer.toBinaryString(convertHexaToDecimal(hexadecimal));
//
//        // ktra chuoi 2 nếu ko co them 0
//        int insertZeros = 4 - (binary.length() % 4);
//        if (insertZeros != 4) {
//            StringBuilder zeros = new StringBuilder();
//            for (int i = 0; i < insertZeros; i++) {
//                zeros.append('0');
//            }
//            binary = zeros.toString() + binary;
//        }
//        StringBuilder binaryWithSpaces = new StringBuilder();
//        for (int i = 0; i < binary.length(); i++) {
//            binaryWithSpaces.append(binary.charAt(i));
//            if ((i + 1) % 4 == 0) {
//                binaryWithSpaces.append(' ');
//            }
//        }
//
//        return binaryWithSpaces.toString();
//    }
    public static String convertHexaToBinary(String hexadecimal) {
        String binary = Integer.toBinaryString(convertHexaToDecimal(hexadecimal));
        return binary;
    }

    // 10 => 2
    public static String convertDecimalToBinary(String decimal) {
        int deci = Integer.parseInt(decimal);//t/hien phep chia nguyen gtri 10-2
        if (deci == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (deci > 0) {
            binary.insert(0, deci % 2);
            deci /= 2;
        }
        return binary.toString();
    }

    // 10 => 16( chu so - ki tu )
    public static char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public static String convertDecimalToHexa(String decimal) {
        String hexa = "";
        int deci = Integer.parseInt(decimal);
        while (deci != 0) {
            hexa = hexDigits[deci % 16] + hexa;
            deci /= 16;
        }
        return hexa;
    }
}
