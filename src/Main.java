import java.util.Scanner;

public class Main {

    public static int convert(java.lang.Long val) {
        if (val == null) {
            return 0;
        } else if (val >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return val.intValue();
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        java.lang.Long longVal = "null".equals(val) ? null : java.lang.Long.parseLong(val);
            /*java.lang.Long longVal2;
            if ("null".equals(val)) {
                longVal2 = null;
            } else {
                longVal2 = java.lang.Long.parseLong(val);
            }*/
        System.out.println(convert(longVal));
    }
}


