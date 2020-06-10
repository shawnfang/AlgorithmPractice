package nowcoderPrimary;

/*
题目描述
从键盘输入5个人的身高（米），求他们的平均身高（米）。
输入描述:
一行，连续输入5个身高（范围0.00~2.00），用空格分隔。
输出描述:
一行，输出平均身高，保留两位小数。
示例1
输入
1.68 1.75 1.82 1.60 1.92
输出
1.75
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC72 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] a = str.split(" ");
            double d = 0;
            for (int i = 0; i < a.length; i++) {
                d +=Double.valueOf(a[i]);
            }
            System.out.printf("%.2f",d/a.length);
        }
    }
}
