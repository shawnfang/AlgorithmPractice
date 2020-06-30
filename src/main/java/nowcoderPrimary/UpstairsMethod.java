package nowcoderPrimary;

/*
题目描述
小乐乐上课需要走n阶台阶，因为他腿比较长，所以每次可以选择走一阶或者走两阶，那么他一共有多少种走法？
输入描述:
输入包含一个整数n (1 ≤ n ≤ 30)
输出描述:
输出一个整数，即小乐乐可以走的方法数。
示例1
输入
2
输出
2
示例2
输入
10
输出
89
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpstairsMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(getNum(n));
    }
    public static int getNum(int n){
        if (n == 1) {
            return  1;
        }
        if (n == 2) {
            return  2;
        }
        return  getNum(n-1)+getNum(n-2);
    }
}
