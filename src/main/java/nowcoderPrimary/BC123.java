package nowcoderPrimary;

/*
题目描述
小乐乐获得4个最大数，请帮他编程找到最大的数。
输入描述:
一行，4个整数，用空格分开。
输出描述:
一行，一个整数，为输入的4个整数中最大的整数。
示例1
输入
5 8 2 5
输出
8
 */

import java.util.Scanner;

public class BC123 {
    public static void main(String[] args) {
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[4];
        s[0] = scanner.nextInt();
        s[1] = scanner.nextInt();
        s[2] = scanner.nextInt();
        s[3] = scanner.nextInt();
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < s.length - 1; i++) {
                if (Integer.compare(s[i], s[i + 1]) == 1) {
                    continue;
                } else {
                    temp = s[i + 1];
                    s[i+1] = s[i];
                    s[i] = temp;
                }
            }
        }
        System.out.println(s[0]);
    }
}
