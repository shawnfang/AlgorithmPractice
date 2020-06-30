package nowcoderPrimary;

/*
题目描述
KiKi和BoBo玩 “井”字棋。也就是在九宫格中，只要任意行、列，
或者任意对角线上面出现三个连续相同的棋子，就能获胜。
请根据棋盘状态，判断当前输赢。
输入描述:
三行三列的字符元素，代表棋盘状态，字符元素用空格分开，代表当前棋盘，
其中元素为K代表KiKi玩家的棋子，为O表示没有棋子，为B代表BoBo玩家的棋子。
输出描述:
如果KiKi获胜，输出“KiKi wins!”；
如果BoBo获胜，输出“BoBo wins!”；
如果没有获胜，输出“No winner!”。
示例1
输入
K O B
O K B
B O K
输出
KiKi wins!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Winner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        String s;
        String[][] strings = new String[3][3];
        int count=0;
        while ((s = bufferedReader.readLine())!=null){
            stringBuffer.append(s);
            stringBuffer.append("\n");
            count++;
            if (count == 3) {
                break;
            }
        }
        String[] line = stringBuffer.toString().split("\n");
        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < line[i].toString().split(" ").length; j++) {
                strings[i][j] = line[i].toString().split(" ")[j];
            }
        }
        if ((strings[0][0].equals("K") && strings[0][1].equals("K") && strings[0][2].equals("K")) ||
                (strings[1][0].equals("K") && strings[1][1].equals("K") && strings[1][2].equals("K")) ||
                (strings[2][0].equals("K") && strings[2][1].equals("K") && strings[2][2].equals("K")) ||
                (strings[0][0].equals("K") && strings[1][0].equals("K") && strings[2][0].equals("K")) ||
                (strings[0][1].equals("K") && strings[1][1].equals("K") && strings[2][1].equals("K")) ||
                (strings[0][2].equals("K") && strings[1][2].equals("K") && strings[2][2].equals("K")) ||
                (strings[0][0].equals("K") && strings[1][1].equals("K") && strings[2][2].equals("K")) ||
                (strings[0][2].equals("K") && strings[1][1].equals("K") && strings[2][0].equals("K"))) {
            System.out.println("KiKi wins!");
        }else if ((strings[0][0].equals("B") && strings[0][1].equals("B") && strings[0][2].equals("B")) ||
                (strings[1][0].equals("B") && strings[1][1].equals("B") && strings[1][2].equals("B")) ||
                (strings[2][0].equals("B") && strings[2][1].equals("B") && strings[2][2].equals("B")) ||
                (strings[0][0].equals("B") && strings[1][0].equals("B") && strings[2][0].equals("B")) ||
                (strings[0][1].equals("B") && strings[1][1].equals("B") && strings[2][1].equals("B")) ||
                (strings[0][2].equals("B") && strings[1][2].equals("B") && strings[2][2].equals("B")) ||
                (strings[0][0].equals("B") && strings[1][1].equals("B") && strings[2][2].equals("B")) ||
                (strings[0][2].equals("B") && strings[1][1].equals("B") && strings[2][0].equals("B"))) {
            System.out.println("BoBo wins!");
        }else {
            System.out.println("No wins!");
        }
    }
}
