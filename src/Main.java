public class Main {
    public static void main(String[] args) {
        int firstNum = -9;
        int secondNum = 13;
        String twosCompFirstNum = TwosComplement.twosComplement(firstNum);
        String twosCompSecondNum = TwosComplement.twosComplement(secondNum);

        String onesCompFirstNum = OnesComplement.onesComplement(firstNum);
        String onesCompSecondNum = OnesComplement.onesComplement(secondNum);

        System.out.println("Number " + firstNum + " in Two's Complement: " + TwosComplement.twosComplement(firstNum));
        System.out.println("Number " + secondNum + " in Two's Complement: " + TwosComplement.twosComplement(secondNum));

        System.out.println("Number " + firstNum + " in One's Complement: " + OnesComplement.onesComplement(firstNum));
        System.out.println("Number " + secondNum + " in One's Complement " + OnesComplement.onesComplement(secondNum));

        System.out.println("Addition of Two's Complement " + Addition.add(twosCompFirstNum, twosCompSecondNum));
        System.out.println("Addition of One's Complement " + Addition.addWithOverflow(onesCompFirstNum, onesCompSecondNum));

        System.out.println("Subtraction of One's Complement " + Subtraction.subtractOnesComplement(firstNum,secondNum));
        System.out.println("Subtraction of Two's Complement " + Subtraction.subtractTwosComplement(firstNum,secondNum));

    }
}
