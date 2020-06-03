package nowcoderPrimary;

/*
题目描述
给定秒数seconds (0< seconds < 100,000,000)，把秒转化成小时、分钟和秒。
输入描述:
一行，包括一个整数，即给定的秒数。
输出描述:
一行，包含三个整数，依次为输入整数对应的小时数、分钟数和秒数（可能为零），中间用一个空格隔开。
示例1
输入
3661
输出
1 1 1
 */

import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSecond = scanner.nextInt();
        int hour = totalSecond/3600;
        int min = totalSecond%3600/60;
        int second = totalSecond%3600%60;
        System.out.printf("%s %s %s",hour,min,second);
    }
}
