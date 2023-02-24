public class TwosComplement {
    public static String twosComplement(int num) {
        String binaryStr = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder(binaryStr);
        // adds 0 until length will be 32 bits
        while (sb.length() < 32)
            sb = new StringBuilder("0" + sb);
        return sb.toString();
    }
}