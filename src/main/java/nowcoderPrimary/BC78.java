package nowcoderPrimary;

/*
题目描述
用筛选法求n以内的素数。筛选法求解过程为：将2~n之间的正整数放在数组内存储，
将数组中2之后的所有能被2整除的数清0，再将3之后的所有能被3整除的数清0 ，
以此类推，直到n为止。数组中不为0 的数即为素数。
输入描述:
多组输入，每行输入一个正整数（不大于100）。
输出描述:
针对每行输入的整数n，输出两行，第一行，输出n之内（包括n）的素数，用空格分隔，
第二行，输出数组中2之后0 的个数。每行输出后换行。
示例1
输入
20
输出
2 3 5 7 11 13 17 19
11
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BC78 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            int n = Integer.parseInt(string);
            int[] numLinear = new int[n-1];
            int[] temp = new int[100];
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 2; i < n; i++) {
                numLinear[i-2] = i;
            }

            for (int i:numLinear) {
                if ((i%2 != 0 && i != 2) && (i%3!=0 && i!=3) || (i == 2 || i == 3)) {
                    temp[i] = i;
                }
            }
            for (int i: temp){
                for (int j = 2; j < i; j++) {
                    if (i%j==0) {
                        temp[i] = 0;
                        break;
                    }
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < temp.length; i++) {
                if (temp[i]!=0) {
                    arrayList.add(temp[i]);
                }
            }

            for (int i :arrayList){
                stringBuffer.append(i+" ");
            }
            System.out.println(stringBuffer);
            System.out.println(numLinear.length - arrayList.size());
        }
    }
}
