package nowcoderPrimary;

/*
题目描述
KiKi得到了一个n行m列的矩阵，现在他想知道第x行第y列的值是多少，请你帮助他完成这个任务。
输入描述:
第一行包含两个数n和m，表示这个矩阵包含n行m列。从2到n+1行，每行输入m个整数（范围-231~231-1），
用空格分隔，共输入n*m个数，表示矩阵中的元素。接下来一行输入x和y，用空格分隔，表示KiKi想得到的元素的位置。(1≤x≤n≤10，1≤y≤m≤10)
输出描述:
一行，输出一个整数值，为KiKi想知道的值。
示例1
输入
2 3
1 2 3
4 5 6
1 2
输出
2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BC102 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int line = Integer.parseInt(s.split(" ")[0]);
        int array = Integer.parseInt(s.split(" ")[1]);
        int[][] ints = new int[line][array];
        String[][] str1=new String[line][array];
        for (int i = 0; i < line; i++) {
            str1[i] = bufferedReader.readLine().split(" ");
            for (int j = 0; j < array; j++) {
                ints[i][j] = Integer.parseInt(str1[i][j]);
            }
        }
        String s1 = bufferedReader.readLine();
        int x = Integer.parseInt(s1.split(" ")[0]);
        int y = Integer.parseInt(s1.split(" ")[1]);
        System.out.println(ints[x-1][y-1]);
    }
}
