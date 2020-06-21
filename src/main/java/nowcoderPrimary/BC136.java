package nowcoderPrimary;

/*
题目描述
给定一个整数序列，KiKi想把其中的重复的整数去掉，并将去重后的序列从小到达排序输出。
输入描述:
第一行，输入一个整数n，表示序列有n个整数。
第二行输入n个整数（每个整数大于等于1，小于等于1000），整数之间用空格分隔。
输出描述:
去重并且从小到大排列的整数序列，整数之间用空格分隔。
示例1
输入
6
5 3 3 4 2 2
输出
2 3 4 5
 */


import java.io.IOException;
import java.util.*;

public class BC136 {
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] numList = scanner.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();
        int temp;
        int count = 0;
        for (int i = 0; i < numList.length; i++) {
            set.add(Integer.parseInt(numList[i]));
        }
        int[] tempList = new int[set.size()];
        Iterator it =set.iterator();
        for (int i = 0; i < set.size(); i++) {
            while (it.hasNext()){
                int next = (int) it.next();
                tempList[i] = next;
                count++;
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < tempList.length-1; j++) {
                if (tempList[j] > tempList[j+1]) {
                    temp = tempList[j+1];
                    tempList[j+1] = tempList[j];
                    tempList[j] = temp;
                }
            }
        }
        for (int i : tempList) {
            stringBuffer.append(i + " ");
        }
        System.out.println(stringBuffer.toString().trim());
    }
}

