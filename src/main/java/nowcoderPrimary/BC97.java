package nowcoderPrimary;

/*
题目描述
有一个有序数字序列，从小到大排序，将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
输入描述:
第一行输入一个整数N(0≤N≤50)。
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC97 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        String[] ascList = bufferedReader.readLine().split(" ");
        int insertNum = Integer.parseInt(bufferedReader.readLine());
        for (String s: ascList){
            if (Integer.parseInt(s)<=insertNum) {
                count++;
            }
        }
        for (int i = 0; i < num; i++) {
            if (i == count) {
                stringBuffer.append(insertNum+" ");
            }else if (i == num-1 && count == num) {
                stringBuffer.append(Integer.parseInt(ascList[i])+" ");
                stringBuffer.append(insertNum + " ");
                break;
            }
            stringBuffer.append(Integer.parseInt(ascList[i])+" ");
        }
        System.out.println(stringBuffer);

    }
}
