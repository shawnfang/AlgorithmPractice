package nowcoderPrimary;

/*
题目描述
KiKi想知道已经给出的三条边a，b，c能否构成三角形，如果能构成三角形，判断三角形的类型（等边三角形、等腰三角形或普通三角形）。
输入描述:
题目有多组输入数据，每一行输入三个a，b，c(0<a,b,c<1000)，作为三角形的三个边，用空格分隔。
输出描述:
针对每组输入数据，输出占一行，如果能构成三角形，等边三角形则输出“Equilateral triangle!”，
等腰三角形则输出“Isosceles triangle!”，其余的三角形则输出“Ordinary triangle!”，反之输出“Not a triangle!”。
示例1
输入
复制
2 3 2
3 3 3
输出
复制
Isosceles triangle!
Equilateral triangle!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BC51 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=br.readLine())!=null) {
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            int c = Integer.parseInt(str.split(" ")[2]);
            if(a+b>c & a+c>b & b+c>a){
                if (a == b && a == c) {
                    System.out.println("Equilateral triangle!");
                }else if(a == b || b == c || a == c){
                    System.out.println("Isosceles triangle!");
                }else {
                    System.out.println("Ordinary triangle!");
                }
            }else {
                System.out.println("Not a triangle!");
            }
        }

    }
}
