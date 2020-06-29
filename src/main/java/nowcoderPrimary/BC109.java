package nowcoderPrimary;
/*
题目描述
KiKi知道什么叫杨辉三角之后对杨辉三角产生了浓厚的兴趣，他想知道杨辉三角的前n行，
请编程帮他解答。杨辉三角，本质上是二项式(a+b)的n次方展开后各项的系数排成的三角形。
其性质包括：每行的端点数为1， 一个数也为1；每个数等于它左上方和上方的两数之和。
输入描述:
第一行包含一个整数数n。 (1≤n≤30)
输出描述:
包含n行，为杨辉三角的前n行，每个数输出域宽为5。
示例1
输入
6
输出
    1
    1    1
    1    2    1
    1    3    3    1
    1    4    6    4    1
    1    5   10   10    5    1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC109 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int sum = 1;
        int[][] s = new int[num+1][num+1];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1 && j < i) {
                    sum = s[i-1][j-1]+s[i-1][j];
                    System.out.printf("%5d", sum);
                    s[i][j] = sum;
                } else {
                    s[i][j] = 1;
                    System.out.printf("%5d", 1);
                }
            }
            System.out.println();
        }
    }
}