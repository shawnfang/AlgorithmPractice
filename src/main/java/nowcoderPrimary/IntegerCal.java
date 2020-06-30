package nowcoderPrimary;

/*
题目描述
输入数字N，然后输入N个数，计算这N个数的和。
输入描述:
第一行输入一个整数N(0≤N≤50)，第二行输入用空格分隔的N个整数。
输出描述:
输出为一行，为第二行输入的“N个整数之和”的计算结果。
示例1
输入
5
1 2 3 4 5
输出
15
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerCal {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        int total = 0;
        for (String s:strings){
            total += Integer.parseInt(s);
        }
        System.out.println(total);
    }
}
