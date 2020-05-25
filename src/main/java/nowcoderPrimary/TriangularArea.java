package nowcoderPrimary;

import java.util.Scanner;

public class TriangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = str.charAt(0);
        System.out.println(c);
        char[] c1 = new char[0];
        for (int i = 0; i < 5; i++) {
            c1[i]=c;
            System.out.println(c1+"\r");

        }
    }
}
