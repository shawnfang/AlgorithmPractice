package nowcoderPrimary;
/*
题目描述
输入一个字符，用它构造一个三角形金字塔。
输入描述:
输入只有一行，一个字符。
输出描述:
该字符构成的三角形金字塔。
示例1
输入
1
输出
    1
   1 1
  1 1 1
 1 1 1 1
1 1 1 1 1
 */
import java.util.Scanner;

public class TriangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = str.charAt(0);
        int n = 5;
        // 控制行数
        for (int i = 0; i < n; i++) {
            // 控制输出的空格
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }
            // 控制输出的1
            for (int m = 0; m <= i; m++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
