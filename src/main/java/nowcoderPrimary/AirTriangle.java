package nowcoderPrimary;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的“空心”三角形图案。
输入描述:
多组输入，一个整数（3~20），表示输出的行数，也表示组成三角形边的“*”的数量。
输出描述:
针对每行输入，输出用“*”组成的“空心”三角形，每个“*”后面有一个空格。
示例1
输入
4
输出
*
* *
*   *
* * * *
示例2
输入
5
输出
*
* *
*   *
*     *
* * * * *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AirTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s ;
        while ((s=bufferedReader.readLine())!=null) {
            int n = Integer.parseInt(s);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == i || i == n - 1) {
                        System.out.print("*" + "\0");
                    } else {
                        System.out.print("\0");
                        System.out.print("\0");
                    }
                }
                if (i < n-1) {
                    System.out.print("\n");
                }
            }
        }
    }
}
