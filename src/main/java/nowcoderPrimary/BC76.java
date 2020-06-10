package nowcoderPrimary;

/*
题目描述
公务员面试现场打分。有7位考官，从键盘输入若干组成绩，每组7个分数（百分制），去掉一个最高分和一个最低分，输出每组的平均成绩。
输入描述:
一行，输入7个整数（0~100），代表7个成绩，用空格分隔。
输出描述:
一行，输出去掉最高分和最低分的平均成绩，小数点后保留2位，每行输出后换行。
示例1
输入
99 45 78 67 72 88 60
输出
73.00
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC76 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        while ((string = bufferedReader.readLine())!=null){
            String[] strings = string.split(" ");
            int[] score = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                score[i] = Integer.parseInt(strings[i]);
            }
            int temp;
            for (int i = 0; i < strings.length ; i++) {
                for (int j = 0; j <= strings.length; j++) {
                    if (j+1 == strings.length) {
                        break;
                    }
                    if (score[j] < score[j+1]) {
                        temp = score[j];
                        score[j] = score[j+1];
                        score[j+1] = temp;
                    }
                }
            }
            int totalScore = 0;
            float averageScore = 0;
            for (int i = 0; i < strings.length-2; i++) {
                totalScore  += score[i+1];
            }
            averageScore = (float) totalScore/(strings.length-2);
            System.out.printf("%.2f",averageScore);
        }
    }
}
