package nowcodeDataStructures;
/*
题目描述
对于一个给定的井字棋棋盘，请设计一个高效算法判断当前玩家是否获胜。
给定一个二维数组board，代表当前棋盘，其中元素为1的代表是当前玩家的棋子，为0表示没有棋子，为-1代表是对方玩家的棋子。
测试样例：
[[1,0,1],[1,-1,-1],[1,-1,0]]
返回：true
 */
import java.util.*;
public class Board {
    public boolean checkWon(int[][] board) {
        // write code here
        boolean result = false;
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 1) {
                    count++;
                }
                if (board[j][i] == 1) {
                    count2++;
                }
                if (board[j][j] == 1) {
                    count3++;
                }
            }
            break;
        }
        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
        if (count == 3 || count2 == 3 || count3 ==3 ) {
            result=true;
            return result;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            for (int j = i; j <= i; j--) {
                for (int k = i; k <= j ; k++) {
                    arrayList.add(board[k][j]);
                    break;
                }
                break;
            }

            if (arrayList.get(0) == 1) {
                count4++;
            }
            arrayList.clear();
        }
        System.out.println(count4);
        if (count4 == 3) {
            result = true;
            return  result;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{1,-1,1},{-1,0,0},{0,0,0}};
        Board board = new Board();
        System.out.println(board.checkWon(a));

    }
}

