package nowcoderPrimary;

import java.util.ArrayList;
import java.util.Scanner;

/*
题目描述
从键盘任意输入一个字符，编程判断是否是字母（包括大小写）。
输入描述:
多组输入，每行输入包括一个字符。
输出描述:
针对每行输入，输出该字符是字母（YES）或不是（NO）。
示例1
输入
H
9
输出
YES
NO
 */
public class Isalpha {
    public static void main(String[] args) {
        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> ch = new ArrayList<>();
        for (int i = 0; i < alp.toCharArray().length; i++) {
            ch.add(alp.charAt(i));
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char c = scanner.next().charAt(0);
            if (ch.contains(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}