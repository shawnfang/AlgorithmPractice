package nowcoderPrimary;

import java.util.ArrayList;

/*
题目描述
KiKi知道了什么是质数（只能被1和他自身整除的数），他现在想知道所有三位整数中，有多少个质数。
输入描述:
无
输出描述:
一行，一个整数，表示所有三位整数中，有多少个质数。
 */
public class BC135 {
    public static void main(String[] args) {
        int count=0;
        int temp = 0;
        for (int j = 100; j < 1000; j++) {
            for (int k = 2; k < j ; k++) {
                if (j%k==0 ) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                temp++;
            }
            count=0;
        }
        System.out.println(temp);
    }
}

