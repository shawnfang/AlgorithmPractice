package nowcoderPrimary;

/*
题目描述
给定n个整数和一个整数x，小乐乐想从n个整数中判断x出现几次，请编程帮他实现。
输入描述:
共3行
第一行，一个整数，表示n（1 <= n <= 100）。
第二行，共输入n个整数，两个整数之间用空格分隔。
第三行，输入一个整数，表示要查找的整数x。
输出描述:
一行，表示整数x出现的次数。
示例1
输入
5
1 1 2 1 3
1
输出
3
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC130 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int lineOne = Integer.parseInt(bufferedReader.readLine());
        String[] lineTwoList = bufferedReader.readLine().split(" ");
        int lineThree = Integer.parseInt(bufferedReader.readLine());
        int count=0;
        for (int i = 0; i < lineTwoList.length; i++) {
            if (lineThree == Integer.parseInt(lineTwoList[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
