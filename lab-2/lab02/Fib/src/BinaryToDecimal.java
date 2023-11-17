public class BinaryToDecimal {
    public static int convertBinaryToDecimal(int binaryDigit) {
        int output = 0;
        int n = 0;
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            output += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }
        return output;
    }
}
