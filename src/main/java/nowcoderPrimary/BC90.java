package nowcoderPrimary;

import javax.swing.plaf.IconUIResource;

/*
题目描述
输入NxM矩阵，矩阵元素均为整数，计算其中大于零的元素之和。
输入描述:
第一行为N M(N: 矩阵行数；M: 矩阵列数,且M,N<=10)，接下来的N行为矩阵各行。
输出描述:
一行，其中大于零的元素之和。
示例1
输入
3 3
2 3 4
-5 -9 -7
0 8 -4
输出
17
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC90 {
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int countLine = 0;
        int total = 0;
        String[] string = bufferedReader.readLine().split(" ");
        while ((s=bufferedReader.readLine())!=null) {
            stringBuffer.append(s);
            stringBuffer.append("\n");
            countLine++;
            if(countLine == Integer.parseInt(string[0])){
                break;
            }
        }
        String[] s1 = stringBuffer.toString().replace("\n"," ").split(" ");
        for (int i = 0; i < s1.length; i++) {
                if (Integer.parseInt(s1[i]) > 0 ) {
                    total += Integer.parseInt(s1[i]);

            }
        }
        System.out.println(total);
    }
}
