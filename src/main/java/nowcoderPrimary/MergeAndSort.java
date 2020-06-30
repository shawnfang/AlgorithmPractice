package nowcoderPrimary;

import java.util.Arrays;

/*
题目描述
输入两个升序排列的序列，将两个序列合并为一个有序序列并输出。
输入描述:
输入包含三行，
第一行包含两个正整数n, m（1 ≤ n,m ≤ 100），用空格分隔。n表示第二行第一个升序序列中数字的个数，m表示第三行第二个升序序列中数字的个数。
第二行包含n个整数（范围1~5000），用空格分隔。
第三行包含m个整数（范围1~5000），用空格分隔。
输出描述:
输出为一行，输出长度为n+m的升序序列，即长度为n的升序序列和长度为m的升序序列中的元素重新进行升序序列排列合并。
示例1
输入
5 6
1 3 7 9 22
2 8 10 17 33 44
输出
1 2 3 7 8 9 10 17 22 33 44
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MergeAndSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int n1 = Integer.parseInt(s.split(" ")[0]);
        int n2 = Integer.parseInt(s.split(" ")[1]);
        String[] sort1 = bufferedReader.readLine().split(" ");
        String[] sort2 = bufferedReader.readLine().split(" ");
        String[] totalSort = new String[n1+n2];
        StringBuffer stringBuffer = new StringBuffer();
        String temp;
        for (int i = 0; i < sort1.length; i++) {
            totalSort[i] = sort1[i];
        }
        for (int i = 0; i < sort2.length; i++) {
            totalSort[i+sort1.length] = sort2[i];
        }
        for (int i = 0; i < totalSort.length; i++) {
            for (int j = 0; j < i; j++) {
                if (Integer.parseInt(totalSort[i]) <= Integer.parseInt(totalSort[j])) {
                    temp = totalSort[i];
                    totalSort[i]= totalSort[j];
                    totalSort[j] = temp;
                }
            }
        }
        for (String s1:totalSort){
            stringBuffer.append(s1+" ");
        }
        System.out.println(stringBuffer);

    }
}
