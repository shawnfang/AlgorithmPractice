package nowcoderPrimary;

/*
题目描述
KiKi想知道这学期他的学习情况，BoBo老师告诉他这学期挂的科目累计的学分，根据所挂学分，判断KiKi学习情况，10分以上：
很危险(Danger++)，4~9分：危险(Danger)，0~3:Good。
输入描述:
一行，一个整数（0~30），表示KiKi挂的科目累计的学分。
输出描述:
一行，根据输入的挂科学分，输出相应学习情况（Danger++，Danger，Good）。
示例1
输入
14
输出
Danger++
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DangeOrGood {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        while ((string = bufferedReader.readLine()) != null){
            int grade = Integer.parseInt(string);
            if (grade >= 10) {
                System.out.println("Danger++");
            }else if(grade >= 4 && grade <= 9){
                System.out.println("Danger");
            }else {
                System.out.println("Good");
            }
        }
    }
}
