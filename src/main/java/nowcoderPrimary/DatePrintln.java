package nowcoderPrimary;

/*
题目描述
KiKi想获得某年某月有多少天，请帮他编程实现。输入年份和月份，计算这一年这个月有多少天。
输入描述:
多组输入，一行有两个整数，分别表示年份和月份，用空格分隔。
输出描述:
针对每组输入，输出为一行，一个整数，表示这一年这个月有多少天。
示例1
输入
2008 2
输出
29
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class DatePrintln {
    public static void main(String[] args) throws IOException {
        int[] bigMonth = new int[]{1,3,5,7,8,10,12};
        ArrayList<Integer> bm = new ArrayList<>();
        for (int m :bigMonth){
            bm.add(m);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            int year = Integer.parseInt(str.split(" ")[0]);
            int month = Integer.parseInt(str.split(" ")[1]);
            if (month == 2) {
                if (year%4 == 0) {
                    System.out.println(29);
                }else {
                    System.out.println(28);
                }
            }else if (bm.contains(month)) {
                System.out.println(31);
            }else {
                System.out.println(30);
                }
        }
    }
}
