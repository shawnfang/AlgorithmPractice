package nowcoderPrimary;


/*
题目描述
输入n科成绩（浮点数表示），统计其中的最高分，最低分以及平均分。
输入描述:
两行，
第1行，正整数n（1≤n≤100）
第2行，n科成绩（范围0.0~100.0），用空格分隔。
输出描述:
输出一行，三个浮点数，分别表示，最高分，最低分以及平均分（小数点后保留2位），用空格分隔。
示例1
输入
5
99.5 100.0 22.0 60.0 88.5
输出
100.00 22.00 74.00
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FloatAverage {
    public static void main(String[] args) throws IOException {
        ArrayList<Float> arrayList = new ArrayList<>();
        float total = 0;
        float lowest = 100;
        float highest = 0;
        float average = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int count = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            for (int i = 0; i <count ; i++) {
                if (Float.valueOf(s.split(" ")[i]) >= highest) {
                    highest = Float.valueOf(s.split(" ")[i]);
                }
                if (Float.valueOf(s.split(" ")[i]) <= lowest) {
                    lowest = Float.valueOf(s.split(" ")[i]);
                }
                total +=Float.valueOf(s.split(" ")[i]);
            }
            System.out.printf("%.2f %.2f %.2f",highest,lowest,total/count);

        }
    }
}
