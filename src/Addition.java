public class Addition {
    static public String addBinary(String firstNum, String secondNum) {
        // initialize the ith index
        int i = firstNum.length() - 1;
        // initialize the jth index
        int j = secondNum.length() - 1;
        // initialize the carry
        int carry = 0;
        // initialize the sum
        int sum = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1) {
            sum = carry;
            if (i >= 0) sum = sum + firstNum.charAt(i) - '0';
            if (j >= 0) sum = sum + secondNum.charAt(j) - '0';
            result.append((char) (sum % 2 + '0'));
            carry = sum / 2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
