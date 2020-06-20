package nowcoderPrimary;

/*
题目描述
KiKi想知道一个n阶方矩是否为上三角矩阵，请帮他编程判定。上三角矩阵即主对角线以下的元素都为0的矩阵，主对角线为从矩阵的左上角至右下角的连线。
输入描述:
第一行包含一个整数n，表示一个方阵包含n行n列，用空格分隔。 (2≤n≤10)
从2到n+1行，每行输入n个整数（范围-231~231-1），用空格分隔，共输入n*n个数。
输出描述:
一行，如果输入方阵是上三角矩阵输出"YES"并换行，否则输出"NO"并换行。
示例1
输入
3
1 2 3
0 4 5
0 0 6
输出
YES
示例2
输入
4
1 2 3 4
5 6 7 8
9 0 11 12
13 0 0 16
输出
NO
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC137 {
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String string;
        int lineCount = 0;
        int count = 0;
        int correct = 0;
        while ((string = bufferedReader.readLine()) != null) {
            stringBuffer.append(string);
            stringBuffer.append("\n");
            lineCount++;
            if (lineCount == num) {
                break;
            }
        }
        String[] s = stringBuffer.toString().split("\n");
        for (int i = 0; i < s.length; i++) {
            String[] cString = s[i].split(" ");
            for (int j = 0; j < i; j++) {
                if (Integer.parseInt(cString[j]) == 0) {
                    count++;
                }
            }
            if (i == count) {
                correct++;
            }
            count = 0;
        }
        if (correct == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
