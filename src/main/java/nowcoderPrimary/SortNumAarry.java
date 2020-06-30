package nowcoderPrimary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
题目描述

有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
输入描述:
共三行，
第一行输入一个整数(0≤N≤50)。
第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
第三行输入想要进行插入的一个整数。
输出描述:
输出为一行，N+1个有序排列的整数。
示例1
输入
7
5 30 40 50 60 70 90
20
输出
5 20 30 40 50 60 70 90
 */
public class SortNumAarry {
    public static int insertOf(String[] arr,int inserNum){
        int indexOf = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) <= inserNum ) {
                indexOf++;
            }
        }
        return indexOf;
    }
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] sortNum = bufferedReader.readLine().split(" ");
        int insertNum = Integer.parseInt(bufferedReader.readLine());
        int indexof = insertOf(sortNum,insertNum);
        System.out.println(indexof);
        for (int i=0; i<n;i++){
            if (i==indexof) {
                stringBuffer.append(String.valueOf(insertNum)+" ");
            }
            stringBuffer.append(sortNum[i]+" ");
            if (i == n-1 && indexof == n) {
                stringBuffer.append(String.valueOf(insertNum)+" ");
            }

        }
        System.out.println(stringBuffer);

    }
}
