package nowcoderPrimary;

/*
题目描述
小乐乐最近接触了求和符号Σ，他想计算的结果。但是小乐乐很笨，请你帮助他解答。
输入描述:
输入一个正整数n  (1 ≤ n ≤ 109)
输出描述:
输出一个值，为求和结果。
示例1
输入
1
输出
1
示例2
输入
10
输出
55
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long a = Integer.parseInt(bufferedReader.readLine());

        System.out.println(getSum(a));
    }

    public static long getSum(long n){
        long sum;
        if (n == 1) {
            sum = 1;
        }else {
            sum = getSum(n-1)+n;
        }
        return sum;
    }
}
