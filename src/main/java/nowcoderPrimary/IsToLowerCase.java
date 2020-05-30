package nowcoderPrimary;
/*
题目描述
实现字母的大小写转换。多组输入输出。
输入描述:
多组输入，每一行输入大写字母。
输出描述:
针对每组输入输出对应的小写字母。
示例1
输入
A
B
输出
a
b
 */
import java.util.ArrayList;
import java.util.Scanner;
public class IsToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String sc = scanner.next().toLowerCase();
            System.out.println(sc);
        }
    }
}
