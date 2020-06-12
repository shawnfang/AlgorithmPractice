package nowcoderPrimary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

/*
题目描述
有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
输入描述:
第一行输入一个整数(0≤N≤50)。
第二行输入N个升序排列的整数，输入用空格分隔的N个整数。
第三行输入想要进行插入的一个整数。
输出描述:
输出为一行，N+1个有序排列的整数。
示例1
输入
5
1 6 9 22 30
8
输出
1 6 8 9 22 30
 */
import java.util.Scanner;
public class BC77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            String[] s = scanner.nextLine().split(" ");
            int insertNum = scanner.nextInt();
            int[] newSort = new int[num+1];
            for (int i = 0; i < s.length; i++) {
                newSort[i] = Integer.parseInt(s[i]);
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < s.length; j++) {
                if (insertNum < newSort[j]) {
                    for (int i = s.length; i > j; i--) {
                          newSort[i] = newSort[i-1];
                    }
                    newSort[j] = insertNum;
                    break;
                }else {
                    newSort[num] = insertNum;
                }
            }
            for (int n : newSort) {
                stringBuffer.append(n+" ");
            }
            System.out.println(stringBuffer);
        }
    }
}
