package nowcoderPrimary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
题目描述
给出两幅相同大小的黑白图像（用0-1矩阵）表示，求它们的相似度。若两幅图像在相同位置上的像素点颜色相同，
则称它们在该位置具有相同的像素点。两幅图像的相似度定义为相同像素点数占总像素点数的百分比。
输入描述:
第一行包含两个整数m和n，表示图像的行数和列数，用单个空格隔开。1≤m≤100, 1≤n≤100。之后m行，
每行n个整数0或1，表示第一幅黑白图像上各像素点的颜色，相邻两个数用单个空格隔开。之后m行，每行n个整数0或1，
表示第二幅黑白图像上各像素点的颜色，相邻两个数用单个空格隔开。
输出描述:
一个实数，表示相似度(以百分比的形式给出)，精确到小数点后两位。
示例1
输入
复制
3 3
1 0 1
0 0 1
1 1 0
1 1 0
0 0 1
0 0 1
输出
复制
44.44
 */
public class BC79 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String count = scanner.nextLine();
            int m = Integer.parseInt(count.split(" ")[0]);
            int n = Integer.parseInt(count.split(" ")[1]);
            int[] totalLine = new int[m*2];
            int[] LineCount = new int[n];
            int counter = 0;
            for (int i = 0; i <totalLine.length ; i++) {
                String x = scanner.nextLine();
                for (int j = 0; j < LineCount.length; j++) {
                    LineCount[j] = Integer.parseInt(x.split(" ")[j]);
                }
            }
            ArrayList<Integer> sameNum1 = new ArrayList<>();
            for (int i = totalLine[0]; i <= m ; i++) {
                for (int j = 0; j < n; j++) {
                    sameNum1.add(LineCount[j]);
                }
            }
            ArrayList<Integer> sameNum2 = new ArrayList<>();
            for (int i = totalLine[m+1]; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sameNum2.add(LineCount[j]);
                }
            }
            for (int i = 0; i < sameNum1.size(); i++) {
                System.out.println(sameNum1.get(i));
                if (sameNum1.get(i).equals(sameNum2.get(i))) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
