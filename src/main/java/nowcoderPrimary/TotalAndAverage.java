package nowcoderPrimary;

/*
题目描述
小乐乐输入三科成绩，请编程帮他输出三科成绩总分及平均分。
输入描述:
一行，3科成绩（浮点数），成绩之间用一个空格隔开。
输出描述:
一行，总分和平均分（小数点后保留两位），用一个空格隔开。
示例1
输入
79.5 80.0 98.0
输出
257.50 85.83
 */

import java.util.Scanner;

public class TotalAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float total = a+b+c;
        float average = (a+b+c)/3;
        System.out.printf("%.2f %.2f",total,average);
    }
}
