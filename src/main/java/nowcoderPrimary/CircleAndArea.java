package nowcoderPrimary;

/*
题目描述
根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
输入描述:
一行，三角形3条边（能构成三角形），中间用一个空格隔开。
输出描述:
一行，三角形周长和面积（保留两位小数），中间用一个空格隔开，输出具体格式详见输出样例。
示例1
输入
3 3 3
输出
circumference=9.00 area=3.90
 */

import java.util.Scanner;
public class CircleAndArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double s = (a+b+c)/2f;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double circle = a+b+c;
        if(a+b>c & a+c>b & b+c>a){
            System.out.printf("circumference=%.2f area=%.2f",circle,area);
        }else {
            System.out.println("不构成一个三角形");
        }
    }
}
