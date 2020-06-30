package nowcoderPrimary;

/*
题目描述
今年是2019年，KiKi想知道1~2019中有多少个包含数字9的数。包含数字的数是指有某一位是“9”的数，例如“2019”、“199”等。
输入描述:
无
输出描述:
一行，一个整数，表示1~2019中共有多少个数包含数字9。
 */

import java.util.ArrayList;

public class NineCount {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 1; i <=2019 ; i++) {
            String s = String.valueOf(i);
            char[] character = s.toCharArray();
            for (int j = 0; j < character.length; j++) {
                if (character[j] == '9') {
                    arrayList.add(s);
                    break;
                }
            }
        }
        System.out.println(arrayList.size());
    }
}
