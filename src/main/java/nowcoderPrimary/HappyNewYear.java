package nowcoderPrimary;

/*
题目描述
2020年来到了，KiKi要对他的n位好朋友说n遍”Happy new year!Good luck!”的祝福语。
输入描述:
输入只有一行，其中含有一个正整数 n(1≤n≤20)，代表KiKi说祝福话的遍数。
输出描述:
输出 n行"Happy new year!Good luck!"。
示例1
输入
2
输出
Happy new year!Good luck!
Happy new year!Good luck!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HappyNewYear {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= num ; i++) {
            System.out.println("Happy new year!Good luck!");
        }
    }
}
