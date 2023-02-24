public class OnesComplement {
    public static String onesComplement(int num) {
        if (num > 0) {
            return TwosComplement.twosComplement(num);
        } else {
            return TwosComplement.twosComplement(num-1);
        }
    }
}
