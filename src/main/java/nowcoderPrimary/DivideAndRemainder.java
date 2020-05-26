package nowcoderPrimary;
/*
题目描述
给定两个整数a和b (－10,000 < a,b < 10,000)，计算a除以b的整数商和余数。
输入描述:
一行，包括两个整数a和b，依次为被除数和除数（不为零），中间用空格隔开。
输出描述:
一行，包含两个整数，依次为整数商和余数，中间用一个空格隔开。
示例1
输入
15 2
输出
7 1
 */
import java.util.Scanner;

public class DivideAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = Integer.valueOf(str.split(" ")[0]);
        int b = Integer.valueOf(str.split(" ")[1]);
        int c = a/b;
        int d = a%b;
        System.out.printf("%d %d",c,d);
    }
}
