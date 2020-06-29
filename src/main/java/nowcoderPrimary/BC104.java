package nowcoderPrimary;

import java.util.Arrays;

/*
题目描述
KiKi想从n行m列的方阵队列中找到身高最高的人的位置，请你帮助他完成这个任务。
输入描述:
第一行包含两个整数n和m，表示这个方阵队列包含n行m列。从2到n+1行，每行输入m个整数（范围-231~231-1），
用空格分隔，共输入n*m个数，表示方阵中的所有人的身高（保证输入身高都不相同）。(1≤x≤n≤10，1≤y≤m≤10)
输出描述:
一行，输出两个整数，用空格分隔，表示方阵中身高最高的人所在的行号和列号。
示例1
输入
2 2
175 180
176 185
输出
2 2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BC104 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        String s = bufferedReader.readLine();
        String string ;
        int line = Integer.parseInt(s.split(" ")[0]);
        int array = Integer.parseInt(s.split(" ")[1]);
        int[][] num = new int[line][array];
        int count = 0;
        int max = 0;
        int maxi = 0;
        int maxj = 0;
        while ((string = bufferedReader.readLine())!=null){
            stringBuffer.append(string);
            stringBuffer.append("\n");
            count++;
            if (count == line) {
                break;
            }
        }
        String[] lineString = stringBuffer.toString().split("\n");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < array; j++) {
                num[i][j] = Integer.parseInt(lineString[i].toString().split(" ")[j]);
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < array ; j++) {
                if (num[i][j] > max) {
                    max = num[i][j];
                    maxi = i+1;
                    maxj = j+1;
                }
            }
        }
        System.out.printf("%s %s",maxi,maxj);


    }
}
