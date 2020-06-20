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
import java.util.ArrayList;

public class BC136 {
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] numList = bufferedReader.readLine().split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int temp;
        for (int i = 0; i < num; i++) {
            if (!arrayList.contains(Integer.parseInt(numList[i]))) {
                arrayList.add(Integer.parseInt(numList[i]));
                stringBuffer.append(numList[i]+" ");
            }
        }
        int[] tempList = new int[stringBuffer.toString().split(" ").length];
        for (int i = 0; i < tempList.length ; i++) {
            tempList[i]=Integer.parseInt(stringBuffer.toString().split(" ")[i]);
        }
        for (int i = 0; i < tempList.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (tempList[j]>tempList[i]) {
                    temp = tempList[i];
                    tempList[i] = tempList[j];
                    tempList[j] = temp;
                }
            }
        }
        for (int i:tempList){
            stringBuffer2.append(i+" ");
        }
        System.out.println(stringBuffer2);
    }
}
