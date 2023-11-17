public class DecimalToAnything {
    public static String convertDecimalToAnything(int decimalDigit, int systemIndex) {
        int remainder;
        String output = "";
        while (decimalDigit > 0) {
            remainder = (decimalDigit % systemIndex);
            output = Integer.toString(remainder) + output;
            decimalDigit = decimalDigit / systemIndex;
        }
        return output;
    }
}
