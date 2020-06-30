package nowcoderPrimary;

/*
题目描述
KiKi知道了大一三科比较重要课程的分数，包括：程序设计基础，高数，英语，请编程帮他找到三科中的最高分。
输入描述:
一行，三个整数，用空格分隔，代表三科成绩。
输出描述:
一行，一个整数，代表输入三科分数中的最高分数。
示例1
输入
90 88 99
输出
99
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintMaxScore {
    public static void main(String[] args) throws IOException {
        int topSocre = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (Integer.parseInt(strings[i])>topSocre) {
                topSocre = Integer.parseInt(strings[i]);
            }
        }
        System.out.println(topSocre);
    }
}
