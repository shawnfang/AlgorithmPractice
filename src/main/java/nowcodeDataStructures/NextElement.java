package nowcodeDataStructures;
/*
题目描述
现在我们有一个int数组，请你找出数组中每个元素的下一个比它大的元素。
给定一个int数组A及数组的大小n，请返回一个int数组，代表每个元素比他大的下一个元素,若不存在则为-1。保证数组中元素均为正整数。
测试样例：
[11,13,10,5,12,21,3],7
返回：[13,21,12,12,21,-1,-1]
 */
import java.util.*;
public class NextElement {
    public int[] findNext(int[] A, int n) {
        // write code here
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(A[i]);
        }
        Stack<Integer> temp = new Stack<>();
        int[] ints = new int[n];
        for (int i = n-1; i >= 0 ; i--) {
            int p = stack.pop();
            if (temp.empty()) {
                ints[i] = -1;
            }else {
                for (int j = temp.size()-1; j>=0; j--) {
                    if (p < temp.get(j)) {
                        ints[i] = temp.get(j);
                        break;
                    }
                }
                if (ints[i] == 0) {
                    ints[i] = -1;
                }
            }
            temp.push(p);
            continue;
        }
        return ints;
    }

    public static void main(String[] args) {
        NextElement nextElement = new NextElement();
        int[] a = {11,13,10,5,12,21,3};
        int[] new_b = nextElement.findNext(a,7);
        for (int i = 0; i < new_b.length; i++) {
            System.out.println(new_b[i]);
        }
    }
}
