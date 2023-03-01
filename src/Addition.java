public class Addition {
    static public String addOnesComplement(String firstNum, String secondNum) {
        // initialize the ith index
        int i = firstNum.length() - 1;
        // initialize the jth index
        int j = secondNum.length() - 1;
        // initialize the carry
        int carry = 0;
        // initialize the sum
        int sum = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 0) {
            sum = carry;
            if (i >= 0) sum = sum + firstNum.charAt(i) - '0';
            if (j >= 0) sum = sum + secondNum.charAt(j) - '0';

            result.append((char) (sum % 2 + '0'));
            carry = sum / 2;
            i--;
            j--;

        }
        String output = result.reverse().toString();
        // adds 1 if bits are overflowed
        if (carry == 1) return addOne(output);

        return output;

    }


        static public String addTwosComplement(String firstNum, String secondNum) {
            // initialize the ith index
            int i = firstNum.length() - 1;
            // initialize the jth index
            int j = secondNum.length() - 1;
            // initialize the carry
            int carry = 0;
            // initialize the sum
            int sum = 0;
            StringBuilder result = new StringBuilder();
            while (i >= 0 || j >= 0 || carry == 0) {
                sum = carry;
                if (i >= 0) sum = sum + firstNum.charAt(i) - '0';
                if (j >= 0) sum = sum + secondNum.charAt(j) - '0';

                result.append((char) (sum % 2 + '0'));
                carry = sum / 2;
                i--;
                j--;

            }
            String output = result.reverse().toString();
            return output;

        }

    public static String addOne(String binaryString) {
        StringBuilder result = new StringBuilder();
        int carry = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1' && carry == 1) {
                result.append('0');
                carry = 1;
            } else if (binaryString.charAt(i) == '0' && carry == 1) {
                result.append('1');
                carry = 0;
            } else {
                result.append(binaryString.charAt(i));
                carry = 0;
            }
        }
        if (carry == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }
}
