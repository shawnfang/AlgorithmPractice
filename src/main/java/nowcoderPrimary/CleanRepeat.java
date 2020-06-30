package nowcoderPrimary;

/*
题目描述
输入n个整数的序列，要求对这个序列进行去重操作。所谓去重，是指对这个序列中每个重复出现的整数，只保留该数第一次出现的位置，删除其余位置。
输入描述:
输入包含两行，第一行包含一个正整数n（1 ≤ n ≤ 1000），表示第二行序列中数字的个数；第二行包含n个整数（范围1~5000），用空格分隔。
输出描述:
输出为一行，按照输入的顺序输出去重之后的数字，用空格分隔。
示例1
输入
5
10 12 93 12 75
输出
10 12 93 75
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CleanRepeat {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] s =  bufferedReader.readLine().split(" ");
        Set<Integer> stringSet = new LinkedHashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (String s1:s){
            stringSet.add(Integer.parseInt(s1));
        }
        for (Iterator iterator = stringSet.iterator(); iterator.hasNext();) {
            stringBuffer.append(iterator.next()+ " ");
        }
        System.out.println(stringBuffer);
    }
}
