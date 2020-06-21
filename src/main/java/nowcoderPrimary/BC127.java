package nowcoderPrimary;

/*
题目描述
小乐乐的老师BoBo想知道班级中谁的数学成绩最高，请编程帮他实现。
输入描述:
共n+1行
第一行输入一个数n，代表小乐乐的班级中n个同学。
第二行输入n个数，用空格相隔，代表班级中每个人的数学成绩。
输出描述:
一个整数，代表班级中最高的数学成绩。
示例1
输入
3
99 89 39
输出
99
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC127 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        int max = 0;
        for (int i = 0; i < strings.length; i++) {
            if (Integer.parseInt(strings[i]) > max) {
                max = Integer.parseInt(strings[i]);
            }
        }
        System.out.println(max);
    }
}
