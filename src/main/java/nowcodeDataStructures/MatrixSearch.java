package nowcodeDataStructures;

/*
题目描述
给定一个N \times MN×M的整形矩阵matrix和一个整数K, matrix的每一行和每一列都是排好序的。
实现一个函数，判断K是否在matrix中
[要求]
时间复杂度为O(N+M)O(N+M)，额外空间复杂度为O(1)O(1)。
输入描述:
第一行有三个整数N, M, K
接下来N行，每行M个整数为输入的矩阵
输出描述:
若K存在于矩阵中输出"Yes"，否则输出"No"
输入
2 4 5
1 2 3 4
2 4 5 6
输出
Yes
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MatrixSearch {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        String s1;
        int count = 0;
        while ((s1=bufferedReader.readLine())!=null){
            stringBuilder.append(s1);
            stringBuilder.append("\n");
            count++;
            if (count == Integer.parseInt(s[0])) {
                break;
            }
        }
        String[] lineString = stringBuilder.toString().split("\n");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < lineString.length; i++) {
            for (int j = 0; j < Integer.parseInt(s[1]); j++) {
                arrayList.add(lineString[i].split(" ")[j]);
            }
        }
        if (arrayList.contains(s[2])) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
