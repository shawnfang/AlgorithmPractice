package nowcodeAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
题目描述
菲波那契数列是指这样的数列：数列的第一个和第二个数都为1，
接下来每个数都等于前面2个数之和。给出一个正整数K，要求菲
波那契数列中第k个数是多少。
输入描述:
输入一行，包含一个正整数k。(0<k<47)
输出描述:
输出一行，包含一个正整数，表示菲波那契数列中第k个数的大小
示例1
输入
19
输出
4181
 */
public class Fib {
    public int fibnac(int n){
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibnac(n-1)+ fibnac(n-2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] ints = new int[n];
        ints[0] = 1;
        ints[1] = 1;
        for (int j = 2; j < ints.length; j++) {
                ints[j] = ints[j-1]+ints[j-2];
        }
        System.out.println(ints[n-1]);
    }
}
