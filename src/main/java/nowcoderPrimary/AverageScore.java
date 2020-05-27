package nowcoderPrimary;
/*题目描述
依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
输入描述:
一行，3科成绩，成绩之间用一个空格隔开。
输出描述:
一行，总成绩和平均成绩（小数点后保留两位），用一个空格隔开。
示例1
输入
79.5 80.0 98.0
输出
257.50 85.83
* */
import java.util.ArrayList;
import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        float a = Float.valueOf(str.split(" ")[0]);
        float b = Float.valueOf(str.split(" ")[1]);
        float c = Float.valueOf(str.split(" ")[2]);
        String total = String.format("%.2f",(a + b + c)) ;
        String average = String.format("%.2f",(a+b+c)/3);
        System.out.printf("%s %s",total,average);
        }
    }

