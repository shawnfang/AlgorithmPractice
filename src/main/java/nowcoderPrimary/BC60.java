package nowcoderPrimary;

import java.util.Scanner;

public class BC60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "* ";
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    System.out.print("  ");
                }
                for(int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
