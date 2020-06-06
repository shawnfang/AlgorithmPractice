package nowcoderPrimary;
/*
题目描述
期中考试开始了，大家都想取得好成绩，争夺前五名。从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩。
输入描述:
两行，第一行输入一个整数，表示n个学生（>=5），第二行输入n个学生成绩（整数表示，范围0~100），用空格分隔。
输出描述:
一行，输出成绩最高的前五个，用空格分隔。
示例1
输入
6
99 45 78 67 72 88
输出
99 88 78 72 67
 */

import java.util.Scanner;
public class BC39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = Integer.parseInt(scanner.nextLine());
        String[] score = scanner.nextLine().split(" ");
        int[] scoreArrary = new int[totalCount];
        for (int i = 0; i < totalCount ; i++) {
            scoreArrary[i] = Integer.parseInt(score[i]);
        }
        int[] tempArray = new int[5];
        int tmp = 0;
        for (int j = 0; j < totalCount; j++) {
            for (int i = 0; i < scoreArrary.length-1; i++) {
                if(scoreArrary[i]<scoreArrary[i+1]){
                    tmp = scoreArrary[i];
                    scoreArrary[i] = scoreArrary[i+1];
                    scoreArrary[i+1]=tmp;
                }
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = scoreArrary[i];
        }
        StringBuffer str = new StringBuffer();
        for (int s : tempArray) {
            str.append(s+" ");
        }
        System.out.println(str);
    }
}

