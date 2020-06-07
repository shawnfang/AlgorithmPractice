package nowcoderPrimary;

/*
题目描述
KiKi想知道从键盘输入的两个数的大小关系，请编程实现。
输入描述:
题目有多组输入数据，每一行输入两个整数（范围（1 ~231-1），用空格分隔。
输出描述:
针对每行输入，输出两个整数及其大小关系，数字和关系运算符之间没有空格，详见输入输出样例。
示例1
输入
1 1
输出
1=1
示例2
输入
1 0
输出
1>0
示例3
输入
0 1
输出
0<1
 */

import java.util.Scanner;

public class BC49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                System.out.printf("%s<%s", a, b);
            } else if (a > b) {
                System.out.printf("%s>%s", a, b);
            } else {
                System.out.printf("%s=%s", a, b);
            }
        }
    }
}
