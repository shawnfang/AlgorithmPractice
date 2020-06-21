package nowcoderPrimary;

/**
 *题目描述
 * 小乐乐想计算一下1!+2!+3!+...+n!。
 * 输入描述:
 * 一行，一个整数n。
 * 输出描述:
 * 一行，一个整数，表示1!+2!+3!+...+n!的结果。
 * 示例1
 * 输入
 * 3
 * 输出
 * 9
 * 备注:
 * 结果范围在int类型范围之内
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC128 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int num = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <=num ; i++) {
            sum+=calResult(i);
        }
        System.out.println(sum);

    }
    public static int calResult(int x){
        int n;
        if (x == 1) {
            n=1;
        }else {
            n = calResult(x-1)*x;
        }
        return n;
    }
}

