package nowcoderPrimary;

/*
题目描述
已知一个函数y=f(x)，当x < 0时，y = 1；当x = 0时，y = 0；当x > 0时，y = -1。
输入描述:
一行，输入一个整数x。（-10000<x<10000）
输出描述:
一行，输出y的值。
示例1
输入
10
输出
-1
示例2
输入
-10
输出
1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC84 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s= bufferedReader.readLine())!=null){
            int num = Integer.parseInt(s);
            if (num == 0) {
                System.out.println(0);
            }else if (num>0) {
                System.out.println(-1);
            }else {
                System.out.println(1);
            }
        }
    }
}
