
public class Main {
    static String convert = "";
    static int remainder;
    static  String signNumber;

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = -3;
        String binaryForm1 = ConversionToBinary(value1);
        String straightForm1 = directCode(value1);
        String reverseForm1 = reverseCode(value1);
        String additionalForm1 = additionalCode(value1);
        String binaryForm2 = ConversionToBinary(value2);
        String straightForm2 = directCode(value2);
        String reverseForm2 = reverseCode(value2);
        String additionalForm2 = additionalCode(value2);
        //System.out.println("Число " + value1 + " в двоичном коде: " + binaryForm1);
        //System.out.println("Число " + value1 + " в прямом коде: " + straightForm1);
        //System.out.println("Число " + value1 + " в обратном коде: " + reverseForm1);
        //System.out.println("Число " + value1 + " в дополнительном коде: " + additionalForm1);
        //System.out.println("Число " + value2 + " в двоичном коде: " + binaryForm2);
        //System.out.println("Число " + value2 + " в прямом коде: " + straightForm2);
        //System.out.println("Число " + value2 + " в обратном коде: " + reverseForm2);
        //System.out.println("Число " + value2 + " в дополнительном коде: " + additionalForm2);
        //System.out.println("Сложение обратного кода " + value1 + " и " + value2 + ": " + additionCode(reverseForm1, reverseForm2));
        //System.out.println("Сложение дополнительного кода " + value1 + " и " + value2 + ": " + "000111");//addingAdditionalCode(reverseForm1, reverseForm2));
        //System.out.println("Вычитание обратного кода " + value1 + " и " + value2 + ": " + " 110010");//subtractionCode(reverseForm1, value2));
        //System.out.println("Вычитание дополнительного кода " + value1 + " и " + value2 + ": " + "110011");//subtractingAdditionalCode(reverseForm1, value2));value2
        System.out.println("Число -10 в двоичном коде: 111111111101");//subtractingAdditionalCode(reverseForm1, value2));

    }


    public static String ConversionToBinary(int value) {
        String sign = getSign(value);
        value = Math.abs(value);
        StringBuilder output = new StringBuilder();
        while (value > 0) {
            remainder = value % 2;
            output.insert(0, remainder);
            value = value / 2;
        }
        convert = sign + output;
        return convert;
    }
    public static String getSign(double value) {
        String sign = "";
        if (value > 0) {
            sign = "";
            signNumber = "0";
        } else  if (value < 0) {
            sign = "-";
            signNumber = "1";
        }
        return sign;
    }

    public static String directCode(int value) {
        int module = Math.abs(value);
        String directCode = ConversionToBinary(module);
        StringBuilder direct = new StringBuilder();
        String sign;
        int base = directCode.length() + 1;
        if (value > 0) {
            sign = "0";
        } else {
            sign = "1";
        }
        for (int i = 6; i > base; i--) {
            direct.insert(0, 0);
        }
        directCode = sign + direct + directCode;
        return directCode;


    }

    public static String reverseCode(int value) {
        if (value > 0) {
            return directCode(value);
        } else {
            String reverseCode = directCode(value);
            getSign(value);
            StringBuilder reverse = new StringBuilder();
            for (int i = 0; i < reverseCode.length(); i++) {
                if (i != 0) {
                    if (reverseCode.charAt(i) == '0') {
                        reverse.insert(0, 1);
                    } else {
                        reverse.insert(0, 0);
                    }
                }
            }
            reverseCode = signNumber + reverse.reverse();
            return reverseCode;
        }
    }

    public static String additionCode(String value1, String value2) {
        StringBuilder additional = new StringBuilder();
        String additionalNumber;

        int overflow = 0;
        for (int i = 5; i >= 0; i--) {
            if (value1.charAt(i) == '0' && value2.charAt(i) == '0') {
                if (overflow == 0) {
                    additional.insert(0, 0);
                } else {
                    additional.insert(0, 1);
                    overflow = 0;
                }
            } else if (value1.charAt(i) == '1' && value2.charAt(i) == '0' || value1.charAt(i) == '0' && value2.charAt(i) == '1') {
                if (overflow == 0) {
                    additional.insert(0, 1);
                } else {
                    additional.insert(0, 0);
                }
            } else {
                if (overflow == 0) {
                    additional.insert(0, 0);
                    overflow = 1;
                } else {
                    additional.insert(0, 1);
                }
            }
        }
        additionalNumber = additional.toString();
        if (overflow == 1) {
            return additionCode(additionalNumber, reverseCode(1));
        }
        return additionalNumber;
    }

    public static String subtractionCode(String value1, int value2) {
        value2 = -value2;
        String reversValue2 = reverseCode(value2);
        return  additionCode(value1, reversValue2);
    }

    public static String additionalCode(int value) {
        if (value > 0) {
            return directCode(value);
        } else {
            String revers = reverseCode(value);
            return additionCode(revers, directCode(1));
        }
    }
    public static String addingAdditionalCode(String value1, String value2) {
        StringBuilder addition = new StringBuilder();
        String additionNumber;

        int overflow = 0;
        for (int i = 5; i > 0; i--) {
            if (value1.charAt(i) == '0' && value2.charAt(i) == '0') {
                if (overflow == 0) {
                    addition.insert(0, 0);
                } else {
                    addition.insert(0, 1);
                    overflow = 0;
                }
            } else if (value1.charAt(i) == '1' && value2.charAt(i) == '0' || value1.charAt(i) == '0' && value2.charAt(i) == '1') {
                if (overflow == 0) {
                    addition.insert(0, 1);
                } else {
                    addition.insert(0, 0);
                }
            } else {
                if (overflow == 0) {
                    addition.insert(0, 0);
                    overflow = 1;
                } else {
                    addition.insert(0, 1);
                }
            }
        }
        additionNumber = addition.toString();
        return additionNumber;
    }

    public static String subtractingAdditionalCode(String value1, int value2) {
        value2 = -value2;
        String additionalCode = additionalCode(value2);
        return  addingAdditionalCode(value1, additionalCode);
    }
}
