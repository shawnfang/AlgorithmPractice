package nowcoderPrimary;

/*
题目描述
KiKi想知道一个整数的奇偶性，请帮他判断。从键盘任意输入一个整数（范围-2^31~2^31-1），编程判断它的奇偶性。
输入描述:
多组输入，每行输入包括一个整数。
输出描述:
针对每行输入，输出该数是奇数（Odd）还是偶数（Even）。
示例1
输入
4
7
输出
Even
Odd
 */

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = Math.abs(scanner.nextInt());
            while (true) {
                num = num%10;
                if (num < 10) {
                    break;
                }
                System.out.println(num);
            }
            if (num==0||num==2||num==4||num==6||num==8) {
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
        }
    }
}

