package nowcoderPrimary;

/*
题目描述
这是一个非常简单的题目，意在考察你编程的基础能力。千万别想难了哦。输入为一行，
包括了用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。输出为一行，为“(a+b-c)*d”的计算结果。
输入描述:
输入为一行，用空格分隔的四个整数a、b、c、d（0 < a, b, c, d < 100,000）。
输出描述:
输出为一行，为“(a+b-c)*d”的计算结果。
示例1
输入
1 3 2 4
输出
8
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        while ((string = bufferedReader.readLine())!=null){
            String[] s = string.split(" ");
            int[] num = new int[4];
            for (int i = 0; i < s.length; i++) {
                num[i] = Integer.parseInt(s[i]);
            }
            System.out.printf("%s",(num[0]+num[1]-num[2])*num[3]);
        }
    }
}
