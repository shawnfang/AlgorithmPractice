package nowcoderPrimary;
/*
题目描述
给定一个浮点数，要求得到该浮点数的个位数。
输入描述:
一行，包括一个浮点数。
输出描述:
一行，包含一个整数，为输入浮点数对应的个位数。
示例1
输入
13.141
输出
3
 */
import java.util.Scanner;
public class BC21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = (int)scanner.nextFloat();
        while (true){
            f = f%10;
            if(f<10){
                break;
            }
        }
        System.out.println(f);
    }
}
