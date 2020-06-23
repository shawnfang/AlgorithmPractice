package nowcoderPrimary;

/*
题目描述
小乐乐在课上学习了二进制八进制与十六进制后，对进制转换产生了浓厚的兴趣。因为他的幸运数字是6，
所以他想知道一个数表示为六进制后的结果。请你帮助他解决这个问题。
输入描述:
输入一个正整数n  (1 ≤ n ≤ 109)
输出描述:
输出一行，为正整数n表示为六进制的结果
示例1
输入
6
输出
10
示例2
输入
120
输出
320
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC111 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (true){
            int y = n%6;
            n = n/6;
            stringBuffer.append(y);
            if (n < 6) {
                stringBuffer.append(n);
                break;
            }
        }
        System.out.println(stringBuffer.reverse());
    }


    }