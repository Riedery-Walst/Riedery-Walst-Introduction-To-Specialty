public class BinaryToNormalNumber {
    public static void convertBinaryToNormalNumber(String str, int bitDepthMan, int bitDepthExp) {
        char signMan;
        if (str.charAt(0) == '-') {
            signMan = '1';
            str = str.substring(1);
            System.out.println("Mantissa sign - 1");
        } else {
            signMan = '0';
            System.out.println("Mantissa sign - 0");
        }

        double line = Double.parseDouble(str);
        int power = 0;
        if (line >= 1){
            while (line >= 1) {
                line = line / 10;
                power++;
            }
        } else if (line < 0.1) {
            while (line < 0.1) {
                line = line * 10;
                power--;
            }
        } else {
            power = 1;
        }
        str = String.valueOf(line);
        StringBuilder stringBuilderMantissa = new StringBuilder(str);
        stringBuilderMantissa.replace(0,1, String.valueOf(signMan));

        while (stringBuilderMantissa.length() > bitDepthMan) {
            stringBuilderMantissa.delete(stringBuilderMantissa.length() - 1, stringBuilderMantissa.length());
        }
        System.out.println("Mantissa with the sign m(a) = " + stringBuilderMantissa);

        String orderStr = String.valueOf(power);
        char signOrder;
        if (orderStr.charAt(0) == '-') {
            signOrder = '1';
            power = Math.abs(power);
        } else {
            signOrder = '0';
        }
        System.out.println("Exponent`s sign is " + signOrder);

        orderStr = DecimalToAnything.convertDecimalToAnything(power, 2);

        StringBuilder stringBuilderOrder = new StringBuilder(orderStr);
        stringBuilderOrder.insert(0, signOrder);

        while (orderStr.length() > bitDepthExp) {
            stringBuilderOrder.delete(stringBuilderOrder.length() - 1, stringBuilderOrder.length());
        }
        System.out.println("Signed exponent fields P(A) = " + stringBuilderOrder);
        System.out.println("Normal number " + stringBuilderMantissa + stringBuilderOrder);
    }
}
