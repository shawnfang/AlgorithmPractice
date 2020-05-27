package nowcoderPrimary;

import java.util.Scanner;

public class CalBmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double weight = scanner.nextDouble();
        Double tall = scanner.nextDouble();
        Double bmi = weight/Math.pow(tall/100,2);
        System.out.print(String.format("%.2f",bmi));
    }
}
