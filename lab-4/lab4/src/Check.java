public class Check {
    public static String check() {
        int initial = 0;
        for (int x1 = 0; x1 < 2; x1++) {
            for (int x2 = 0; x2 < 2; x2++) {
                initial = x1 ^ x2 ^ (x1 ^ x2);
                System.out.println("x1:" + x1);
                System.out.println("x2:" + x2);
                System.out.println("Result:" + initial);
            }
        }
        return "Final Answer:" + initial;
    }
}
