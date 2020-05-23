package nowcoderPrimary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
题目描述
依次输入一个学生的学号，以及3科（C语言，数学，英语）成绩，在屏幕上输出该学生的学号，3科成绩。
输入描述:
学号以及3科成绩，学号和成绩之间用英文分号隔开，成绩之间用英文逗号隔开。
输出描述:
学号，3科成绩，输出格式详见输出样例。
示例1
输入
17140216;80.845,90.55,100.00
输出
The each subject score of  No. 17140216 is 80.85, 90.55, 100.00.
* */
public class ConsoleStuNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strInfo = scanner.next();
        String a = strInfo.split(";")[0];
        String[] b = strInfo.split(";")[1].split(",");
        List c  = new ArrayList<>();
        for (String s:b){
            Double d = new Double(s);
            c.add(String.format("%.2f",d));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<c.size();i++){
            sb.append(c.get(i));
            if(i<c.size()-1){
                sb.append(", ");
            }
        }
        System.out.println("The each subject score of  No. " + a +" is "+sb+".");
    }
}
