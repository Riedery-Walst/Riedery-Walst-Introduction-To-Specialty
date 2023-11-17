// public class toBinary {
/*    public static class ParsDemo {
        static int num;
        static String str;
        ParsDemo(int num) {
            this.num = num;
        }

        public static String convertToBinary(int num) {
            if (ParsDemo.num > 0) {
                str = String.format("%8s", Integer.toBinaryString(ParsDemo.num)).replaceAll(" ", "0");
            } else {
                str = String.valueOf(ParsDemo.num);
                str = str.substring(1);
                num = Integer.parseInt(str);
                str = Integer.toBinaryString(num);
                StringBuilder stringBuilder = new StringBuilder(str);
                while (stringBuilder.length() < 7) {
                    stringBuilder.insert(0, 0);
                }
                stringBuilder.insert(0, 1);
            }
            return str;
        }
    }
}*/
    public class ParsDemo {
        static int num;
     static int result;
        static String str;
        ParsDemo(int num) {
            this.num = num;
        }

        public static String convertToBinary(int num) {
            if (ParsDemo.num > 0) {
                str = String.format("%8s", Integer.toBinaryString(ParsDemo.num)).replaceAll(" ", "0");
            } else {
                str = String.valueOf(ParsDemo.num);
                str = str.substring(1);
                num = Integer.parseInt(str);
                str = Integer.toBinaryString(num);
                StringBuilder stringBuilder = new StringBuilder(str);
                while (stringBuilder.length() < 5) {
                    stringBuilder.insert(0, 0);
                }
                stringBuilder.insert(0, 1);
            }
            return str;
        }
    }

