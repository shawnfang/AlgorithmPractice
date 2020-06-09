package nowcoderPrimary;

import java.util.Scanner;

public class BC61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i<n;i++){
                for (int j = n-1; j > i; j--) {
                    System.out.print(" ");
                }
                for (int m = 0; m <= i; m++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
