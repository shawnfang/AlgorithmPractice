package nowcoderPrimary;

/*
题目描述
小乐乐的班主任想统计一下班级里一共有多少人需要被请家长，三个成绩（语文，数学，外语）
平均分低于60的将被请家长，小乐乐想编程帮助班主任算一下有多少同学被叫家长。
输入描述:
共n+1行
第一行，输入一个数n，代表小乐乐的班级中有n个同学。
在接下来的n行中每行输入三个整数代表班级中一个同学的三科成绩（语文，数学，外语），用空格分隔。
输出描述:
一行，一个整数，代表班级中需要被请家长的人数。
示例1
输入
3
80 100 90
40 70 65
20 84 93
输出
1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallParentNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int n = Integer.parseInt(bufferedReader.readLine());
        String s;
        int count=0;
        int score = 0;
        int calParent = 0;
        while ((s=bufferedReader.readLine())!=null){
            stringBuffer.append(s);
            stringBuffer.append("\n");
            count++;
            if (count == n) {
                break;
            }
        }
        String[] stringsList = stringBuffer.toString().split("\n") ;
        for (int i = 0; i < stringsList.length; i++) {
            for (int j = 0; j < 3; j++) {
                score += Integer.parseInt(stringsList[i].split(" ")[j]);
            }
            if (score/3 < 60) {
                calParent++;
            }
            score=0;
        }
        System.out.println(calParent);
    }
}
