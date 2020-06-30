package nowcoderPrimary;

/*
题目描述
输入3科成绩，然后把三科成绩输出，成绩为整数形式。
输入描述:
一行，3科成绩，用空格分隔，范围（0~100）。
输出描述:
一行，把3科成绩显示出来，输出格式详见输出样例。
示例1
输入
60 80 90
输出
score1=60,score2=80,score3=90
 */

import java.util.Scanner;

public class PritfScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.printf("score1=%s,score2=%s,score3=%s",a,b,c);
    }
}
