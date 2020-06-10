package nowcoderPrimary;

/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的直角三角形图案。
输入描述:
多组输入，一个整数（2~20），表示直角三角形直角边的长度，即“*”的数量，也表示输出行数。
输出描述:
针对每行输入，输出用“*”组成的对应长度的直角三角形，每个“*”后面有一个空格。
示例1
输入
4
输出
*
* *
* * *
* * * *
示例2
输入
5
输出
*
* *
* * *
* * * *
* * * * *
 */

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class BC58 {
    public static void mehodOne(){
        Scanner scanner = new Scanner(System.in);
        String string = "*";
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf(string+" ");
                }
                System.out.print("\n");
            }
        }
    }

    public static void methodTwo(){
        String s = "* ";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.println(new String(new char[i]).replace("\0", s));
            }
        }
    }

    public static void main(String[] args) {
        BC58.methodTwo();
    }
}
