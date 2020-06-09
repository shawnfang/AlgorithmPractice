package nowcoderPrimary;

import java.util.Scanner;

public class BC60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "*";
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                for (int j = num; j >= i ; j--) {
                    System.out.printf(" ");
                }
                for (int m = 0; m <= i; m++) {
                    System.out.printf(string);
                }
                System.out.print("\n");
            }
        }
    }
}
