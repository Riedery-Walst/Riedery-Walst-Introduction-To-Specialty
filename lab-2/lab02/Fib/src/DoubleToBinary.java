public class DoubleToBinary {
    public static String convertDoubleToBinaryString(double decimal) {
        double signCheck = decimal;
        if (decimal < 0) {
            decimal = decimal * -1;
        }
        int wholeNumber = (int) decimal;
        int reminder;
        String output = "";
        double temp = decimal - (double) wholeNumber;
        while (wholeNumber > 0) {
            reminder = (wholeNumber % 2);
            output = Integer.toString(reminder) + output;
            wholeNumber = wholeNumber / 2;
        }
        output = output + ".";
        for (int i = 0; i < 5; i++){
            if ((temp * 2) > 1){
                reminder = 1;
                output = output + Integer.toString(reminder);
            } else {
                reminder = 0;
                output = output + Integer.toString(reminder);
                temp =  temp * 2;
            }
        }
        if (signCheck < 0) {
            return '-' + output;
        } else
            return output;
    }
}
