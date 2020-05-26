package nowcoderPrimary;

import java.util.Scanner;
/*
题目描述
将一个四位数，反向输出。
输入描述:
一行，输入一个整数n（1000 <= n <= 9999）。
输出描述:
针对每组输入，反向输出对应四位数。
示例1
输入
1234
输出
4321
 */
public class ReversePushed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a = i/1000;
        int b = i/100%10;
        int c = i/10%10%10;
        int d = i%10%10%10%10;
        String x = String.valueOf(d)+String.valueOf(c)+String.valueOf(b)+String.valueOf(a);
        System.out.printf("%s",x);
    }
}
