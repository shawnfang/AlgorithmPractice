package nowcoderPrimary;

/*
题目描述
KiKi想知道他的考试成绩是否完美，请帮他判断。从键盘输入一个整数表示的成绩，编程判断成绩是否在90~100之间，如果是则输出“Perfect”。
输入描述:
多组输入，每行输入包括一个整数表示的成绩（90~100）。
输出描述:
针对每行输入，输出“Perfect”。
示例1
输入
98
输出
Perfect
 */

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int score = scanner.nextInt();
            if (score >= 90 && score <= 100) {
                System.out.println("Perfect");
            }else {
                System.out.println("Normal");
            }
        }
    }
}
