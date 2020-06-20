package nowcoderPrimary;

/*
题目描述
给定一个整数序列，KiKi想把其中的重复的整数去掉，并将去重后的序列从小到达排序输出。
输入描述:
第一行，输入一个整数n，表示序列有n个整数。
第二行输入n个整数（每个整数大于等于1，小于等于1000），整数之间用空格分隔。
输出描述:
去重并且从小到大排列的整数序列，整数之间用空格分隔。
示例1
输入
6
5 3 3 4 2 2
输出
2 3 4 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class BC136{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] s =br.readLine().trim().split(" +");
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new TreeSet<>();
        for(String str:s)
            set.add(Integer.parseInt(str));

        for(Integer i:set)
            sb.append(i+" ");
        System.out.println(sb.toString().trim());

    }
}