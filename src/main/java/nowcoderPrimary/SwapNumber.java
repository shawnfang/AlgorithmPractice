package nowcoderPrimary;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String a = str.split(",")[0];
        String a1 = a.split("=")[0];
        String a2 = a.split("=")[1];
        String b = str.split(",")[1];
        String b1 = b.split("=")[0];
        String b2 = b.split("=")[1];
        System.out.printf("a=%s,b=%s",b2,a2);

    }
}
