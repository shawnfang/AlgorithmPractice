package nowcoderPrimary;

import java.util.ArrayList;

/*
题目描述
输入一个整数序列，判断是否是有序序列，有序，指序列中的整数从小到大排序或者从大到小排序。
输入描述:
第一行输入一个整数N(3≤N≤50)。
第二行输入N个整数，用空格分隔N个整数。
输出描述:
输出为一行，如果序列有序输出sorted，否则输出unsorted。
示例1
输入
5
1 6 9 22 30
输出
sorted
示例2
输入
5
3 4 7 2 10
输出
unsorted
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BC96 {
    public static void main(String[] args) throws IOException {
        int sortTemp = 0;
        int sort = 0 ;
        int unsortTemp = Integer.MAX_VALUE;
        int unsort = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            if (Integer.parseInt(strings[i]) > sortTemp) {
                sortTemp = Integer.parseInt(strings[i]);
                sort++;
            }
            if (Integer.parseInt(strings[i]) < unsortTemp) {
                unsortTemp = Integer.parseInt(strings[i]);
                unsort++;
            }
        }
        if (sort == num || unsort == num) {
            System.out.println("sorted");
        }else {
            System.out.println("unsorted");
        }
    }
}
