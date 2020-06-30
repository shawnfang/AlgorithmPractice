package nowcoderPrimary;

/*
题目描述
KiKi这学期努力学习程序设计基础，要期末考试了，BoBo老师告诉他，总成绩包括四个部分，如下：
总成绩 = 实验成绩 * 20% + 课堂表现成绩 * 10% + 过程考核成绩 * 20% + 期末上机考试成绩 * 50%，现在输入KiKi的各项成绩，请计算KiKi的总成绩。
输入描述:
一行，包括四个整数（百分制），用空格分隔，分别表示实验成绩，课堂表现成绩，过程考核成绩，期末上机考试成绩。
输出描述:
一行，总成绩，保留小数点一位。
示例1
输入
100 100 90 80
输出
88.0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalScore {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        double total =(Double)(Integer.parseInt(strings[0])*0.2+Integer.parseInt(strings[1])*0.1+
                Integer.parseInt(strings[2])*0.2+Integer.parseInt(strings[3])*0.5);
        System.out.printf("%s",total);

    }
}
