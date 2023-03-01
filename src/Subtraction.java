public class Subtraction {

    static public String subtractOnesComplement(int firstNum, int secondNum) {
        String onesCompFirstNum = OnesComplement.onesComplement(firstNum);
        String onesCompSecondNum;
        if (secondNum > 0) {
            onesCompSecondNum = OnesComplement.onesComplement(secondNum*-1);
            String result = Addition.addWithOverflow(onesCompFirstNum, onesCompSecondNum);
            return  result.replace('0', '2').replace('1', '0').replace('2', '1');
        } else {
            onesCompSecondNum = OnesComplement.onesComplement(secondNum);
            String result = Addition.addWithOverflow(onesCompFirstNum, onesCompSecondNum);
            return  result.replace('0', '2').replace('1', '0').replace('2', '1');
        }
    }

    static public String subtractTwosComplement(int firstNum, int secondNum) {
        String twosCompFirstNum = TwosComplement.twosComplement(firstNum);
        String twosCompSecondNum;
        if (secondNum > 0) {
            twosCompSecondNum = TwosComplement.twosComplement(secondNum*-1);
            String result = Addition.add(twosCompFirstNum, twosCompSecondNum);
            result = result.replace('0', '2').replace('1', '0').replace('2', '1');
            return Addition.addOne(result);
        } else {
            twosCompSecondNum = TwosComplement.twosComplement(secondNum);
            String result = Addition.add(twosCompFirstNum, twosCompSecondNum);
            result = result.replace('0', '2').replace('1', '0').replace('2', '1');
            return Addition.addOne(result);
        }
    }
}

