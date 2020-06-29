package nowcoderPrimary;

/*
题目描述
KiKi想知道一个n阶方矩是否为上三角矩阵，请帮他编程判定。
上三角矩阵即主对角线以下的元素都为0的矩阵，主对角线为从矩阵的左上角至右下角的连线。
输入描述:
第一行包含一个整数n，表示一个方阵包含n行n列，用空格分隔。 (1≤n≤10)
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
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC106 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        int zeroCount = 0;
        int bingo = 0;
        String s;
        StringBuffer stringBuffer = new StringBuffer();
        while ((s = bufferedReader.readLine())!=null){
            stringBuffer.append(s);
            stringBuffer.append("\n");
            count++;
            if (count == num) {
                break;
            }
        }
        String[] line = stringBuffer.toString().split("\n");
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (line[i].toString().split(" ")[j].equals("0")) {
                    zeroCount++;
                }
            }
            if (zeroCount == i) {
                bingo++;
            }
            zeroCount = 0;
        }
        if (bingo == num) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
