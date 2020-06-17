package nowcoderPrimary;
/*
题目描述
任意输入一个正整数N，统计1~N之间奇数的个数和偶数的个数，并输出。
输入描述:
一行，一个正整数N。（1≤N≤100,000）
输出描述:
一行，1~N之间奇数的个数和偶数的个数，用空格分开。
示例1
输入
5
输出
3 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BC86 {
    public static void main(String[] args) {
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%2 == 0) {
                evenNumber.add(i);
            }else {
                oddNumber.add(i);
            }
        }
        System.out.printf("%s %s",oddNumber.size(),evenNumber.size());

    }
}
