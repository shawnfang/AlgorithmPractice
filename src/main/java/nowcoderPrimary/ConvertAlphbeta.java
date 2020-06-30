package nowcoderPrimary;

/*
题目描述
KiKi想完成字母大小写转换，有一个字符，判断它是否为大写字母，如果是，将它转换成小写字母；反之则转换为大写字母。
输入描述:
多组输入，每一行输入一个字母。
输出描述:
针对每组输入，输出单独占一行，输出字母的对应形式。
示例1
输入
a
A
Z
输出
A
a
z
 */

import java.util.Scanner;

public class ConvertAlphbeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char ch = scanner.next().charAt(0);
            if (Character.isLowerCase(ch)) {
                System.out.println(Character.toUpperCase(ch));
            }else {
                System.out.println(Character.toLowerCase(ch));
            }
        }
    }
}
