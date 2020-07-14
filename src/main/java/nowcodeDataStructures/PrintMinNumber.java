package nowcodeDataStructures;

import java.util.Arrays;
import java.util.Comparator;

/*
题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为321323。
 */
public class PrintMinNumber {
    public String PrintMinNum(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrList = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arrList[i] = String.valueOf(numbers[i]);
        }
        cmp(arrList);
        for (String s : arrList) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    public static void cmp(String[] strings) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String temp1 = o1 + o2;
                String temp2 = o2 + o1;
                return temp1.compareTo(temp2);
            }
        });
    }
    public static void main (String[]args){
        PrintMinNumber printMinNumber = new PrintMinNumber();
        int[] a = {3, 5, 1, 4, 2};
        printMinNumber.PrintMinNum(a);
    }
}
