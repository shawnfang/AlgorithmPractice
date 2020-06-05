package nowcoderPrimary;

/*
题目描述
假设你们社团要竞选社长，有两名候选人分别是A和B，社团每名同学必须并且只能投一票，最终得票多的人为社长.
输入描述:
一行，字符序列，包含A或B，输入以字符0结束。
输出描述:
一行，一个字符，A或B或E，输出A表示A得票数多，输出B表示B得票数多，输出E表示二人得票数相等。
示例1
输入
ABBABBAAB0
输出
B
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BC40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vote = scanner.nextLine().toCharArray();
        ArrayList<Character> Avote = new ArrayList<>();
        ArrayList<Character> Bvote = new ArrayList<>();
        for (int i = 0; i < vote.length; i++) {
            if(vote[i]=='A'){
                Avote.add(vote[i]);
            }else if(vote[i]=='B'){
                Bvote.add(vote[i]);
            }else {
                break;
            }
        }
        if(Avote.size()>Bvote.size()){
            System.out.println("A");
        }else if(Avote.size()<Bvote.size()){
            System.out.println("B");
        }else {
            System.out.println("E");
        }
    }
}
