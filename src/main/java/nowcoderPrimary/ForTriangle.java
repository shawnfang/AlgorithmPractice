package nowcoderPrimary;
/*
题目描述
KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，该任务是打印用“*”组成的带空格直角三角形图案。
输入描述:
多组输入，一个整数（2~20），表示直角三角形直角边的长度，即“*”的数量，也表示输出行数。
输出描述:
针对每行输入，输出用“*”组成的对应长度的直角三角形，每个“*”后面有一个空格。
示例1
输入
5
输出
        *
      * *
    * * *
  * * * *
* * * * *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForTriangle {
    public static void methodOne(){
        Scanner scanner = new Scanner(System.in);
        String string = "* ";
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    System.out.print("  ");
                }
                for(int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void methodTwo() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            int a = Integer.parseInt(s);
            for (int i = 1; i <= a; i++) {
                for (int j = a; j > 0; j--) {
                    if (j == 1) {
                        System.out.print("* \n");
                    } else if (j == i || j < i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        ForTriangle.methodTwo();
    }
}
