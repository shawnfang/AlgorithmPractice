package nowcodeDataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
题目描述
给定一个数组arr，其中只可能含有0、1、2三个值，请实现arr的排序
[要求]
时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)

输入描述:
第一行一个整数N。表示数组长度
接下来一行N个整数表示数组内的数
输出描述:
输出N个整数，表示排序后的结果
示例1
输入
复制
5
2 0 1 2 0
输出
复制
0 0 1 2 2
备注:
1 ⩽N⩽10^5

保证arr_i=0/1/2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrSort {
    public static void sortArrary(String[] strings,int n,int first){
        for (int i = 0; i < n-1; i++) {
            sortArrary(strings,n-1,first+1);
            if (Integer.parseInt(strings[first]) > Integer.parseInt(strings[first+1]) ) {
                swap(strings,first,first+1);
            }
        }
    }
    public static void swap(String[] sArrary,int first,int second){
        int temp;
        temp = Integer.parseInt(sArrary[first]);
        sArrary[first] =sArrary[second];
        sArrary[second] = String.valueOf(temp);
    }
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        String[] s;
        int num = Integer.parseInt(bufferedReader.readLine());
        s = bufferedReader.readLine().split(" ");
        sortArrary(s,num,0);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<num;i++){
            res.append(Integer.parseInt(s[i])).append(" ");
        }
        System.out.println(res);
    }
}
