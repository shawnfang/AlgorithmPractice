package nowcoderPrimary;

/*
题目描述
KiKi理解了继承可以让代码重用，他现在定义一个基类shape，私有数据为坐标点x,y,由它派生Rectangle类和Circle类，
它们都有成员函数GetArea()求面积。派生类Rectangle类有数据：矩形的长和宽；派生类Circle类有数据：圆的半径。
Rectangle类又派生正方形Square类，定义各类并测试。输入三组数据，分别是矩形的长和宽、圆的半径、正方形的边长，输出三组数据，
分别是矩形、圆、正方形的面积。圆周率按3.14计算。

输入描述:
输入三行，
第一行为矩形的长和宽，第二行为圆的半径，第三行为正方形的边长。
输出描述:
三行，分别是矩形、圆、正方形的面积。
示例1
输入
7 8
10
5
输出
56
314
25
 */

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

class Shape{
    private int x;
    private int y;
}
class Rectangle extends  Shape{
    public int GetArea(int length,int width){
        int s = length*width;
        return s;
    }
}

class Circle extends Shape{
    public double GetArea(double r){
        double s = 3.14*Math.pow(r,2);
        return s;
    }
}
class Square extends Rectangle{
    public double GetArea(int width){
        double s = Math.pow(width,2);
        return s;
    }
}
public class BC140 {
    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance();
        Scanner scanner = new Scanner(System.in);
        String rt = scanner.nextLine();
        int w = Integer.parseInt(rt.split(" ")[0]);
        int l = Integer.parseInt(rt.split(" ")[1]);
        Rectangle rectangle = new Rectangle();
        int rectangleArea = rectangle.GetArea(l,w);

        double r = new Double(scanner.nextLine());
        Circle circle = new Circle();
        String c =String.valueOf(circle.GetArea(r));
        // 去掉多余的0
        String circleArea =BigDecimal.valueOf(Double.parseDouble(c)).stripTrailingZeros().toPlainString();

        int dw = Integer.parseInt(scanner.nextLine());
        Square square = new Square();
        int squareArea = new Double(square.GetArea(dw)).intValue();

        System.out.println(rectangleArea);
        System.out.println(circleArea);
        System.out.println(squareArea);
    }

}
