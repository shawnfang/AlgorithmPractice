package nowcoderPrimary;

/*
题目描述
KiKi参加了语文、数学、外语的考试，请帮他判断三科中的最高分。从键盘任意输入三个整数表示的分数，编程判断其中的最高分。
输入描述:
多组输入，每行输入包括三个整数表示的分数（0~100），用空格分隔。
输出描述:
针对每行输入，输出为一行，即三个分数中的最高分。
示例1
输入
94 98 99
100 88 60
输出
99
100
 */

import java.util.Scanner;

public class BC45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] score = scanner.nextLine().split(" ");
            int cScore = Integer.parseInt(score[0]);
            int mScore = Integer.parseInt(score[1]);
            int eScore = Integer.parseInt(score[2]);
            if (cScore >= mScore && cScore >= eScore) {
                System.out.println(cScore);
            } else if (mScore >= cScore && mScore >= eScore) {
                System.out.println(mScore);
            } else {
                System.out.println(eScore);
            }
        }
    }
}