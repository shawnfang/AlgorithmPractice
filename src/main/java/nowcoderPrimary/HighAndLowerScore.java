package nowcoderPrimary;

/*
题目描述
输入n个成绩，换行输出n个成绩中最高分数和最低分数的差。
输入描述:
两行，第一行为n，表示n个成绩，不会大于10000。
第二行为n个成绩（整数表示，范围0~100），以空格隔开。
输出描述:
一行，输出n个成绩中最高分数和最低分数的差。
示例1
输入
10
98 100 99 97 95 99 98 97 96 100
输出
5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighAndLowerScore {
    public static void main(String[] args) throws IOException {
        int max = 0;
        int min = 100;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        for (String s:strings){
            if (Integer.parseInt(s)<min) {
                min = Integer.parseInt(s);
            }
            if (Integer.parseInt(s)>max) {
                max = Integer.parseInt(s);
            }
        }
        System.out.println(max-min);
    }
}
