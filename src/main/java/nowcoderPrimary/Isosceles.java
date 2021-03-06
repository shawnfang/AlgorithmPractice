package nowcoderPrimary;
/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的金字塔图案。
输入描述:
多组输入，一个整数（2~20），表示金字塔边的长度，即“*”的数量，，也表示输出行数。
输出描述:
针对每行输入，输出用“*”组成的金字塔，每个“*”后面有一个空格。
示例1
输入
4
输出
   *
  * *
 * * *
* * * *
 */
import java.util.Scanner;
public class Isosceles {
    public static void answerOne(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i<n;i++){
                for (int j = n-1; j > i; j--) {
                    System.out.print(" ");
                }
                for (int m = 0; m <= i; m++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void answerTwo(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Isosceles.answerTwo();
    }
}
