package nowcodeDataStructures;

import java.util.ArrayList;
import java.util.TreeSet;

/*
题目描述
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
则打印出这三个数字能排成的最小数字为321323。
 */
public class PrintMinNumber {
    public String PrintMinNum(int [] numbers) {
        TreeSet<String> treeSet = new TreeSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            
        }
        System.out.println("测试");
        System.out.println(treeSet.first());
        return treeSet.first();
    }
    public static void swap(int[] arr,int a,int b){
        int temp;
        temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void main(String[] args) {
        PrintMinNumber printMinNumber = new PrintMinNumber();
        int[] a = {3,5,1,4,2};
        printMinNumber.PrintMinNum(a);
    }
}
