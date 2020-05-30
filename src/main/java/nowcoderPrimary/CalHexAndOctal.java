package nowcoderPrimary;

/*
题目描述
输入一个十六进制数a，和一个八进制数b，输出a+b的十进制结果（范围-231~231-1）。
输入描述:
一行，一个十六进制数a，和一个八进制数b，中间间隔一个空格。
输出描述:
一行，a+b的十进制结果。
示例1
输入
0x12 05
输出
23
备注:
十六进制Hexadecimal一般以0x开头，例如0xFF。八进制Octal，一般以0开头，例如07。
 */

import java.util.Scanner;

public class CalHexAndOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int hex = Integer.valueOf(num.split(" ")[0].substring(2),16);
        int oct = Integer.valueOf(num.split(" ")[1].substring(1),8);
        int total = hex+oct;
        System.out.print(total);

    }
}
