public class Subtraction {
    static public String subtractBinary(String firstNum, String secondNum) {
        // check negative number
        if (firstNum.startsWith("1")) {
            // revers bits
            firstNum = firstNum.replace('0', '2').replace('1', '0').replace('2', '1');
            // change first char to 1
            firstNum = firstNum.substring(0, 0) + "1" + firstNum.substring(1);
        } else if (secondNum.startsWith("1")) {
            secondNum = secondNum.replace('0', '2').replace('1', '0').replace('2', '1');
            firstNum = firstNum.substring(0, 0) + "1" + firstNum.substring(1);
        }

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

