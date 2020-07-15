package nowcodeDataStructures;

import java.util.Arrays;

/*
题目描述
给定一个数组arr，返回不包含本位置值的累乘数组
例如，arr=[2,3,1,4]，返回[12, 8, 24, 6]，即除自己外，其他位置上的累乘
[要求]
时间复杂度为O(n)O(n)，额外空间复杂度为O(1)O(1)
输入描述:
第一行有两个整数N, P。分别表示序列长度，模数(即输出的每个数需要对此取模)
接下来一行N个整数表示数组内的数
输出描述:
输出N个整数表示答案
示例1
输入
4 100000007
2 3 1 4
输出
12 8 24 6
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ProductIterator {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] np = bufferedReader.readLine().split(" ");
        String[] arr = bufferedReader.readLine().split(" ");
        long tmp = 1;
        long[] ints = new long[Integer.parseInt(np[0])];
        for (int i = 0; i < ints.length; i++) {
                tmp *= Integer.parseInt(arr[i]);
                tmp %= Integer.parseInt(np[1]);
        }
        for (int i = 0; i < ints.length; i++) {
            ints[i] = tmp/Integer.parseInt(arr[i]);
            ints[i] %=Integer.parseInt(np[1]);
        }
        for (Long i:ints){
            stringBuilder.append(i+" ");
        }
        System.out.println(stringBuilder);

    }
}
