package nowcodeDataStructures;

import java.util.ArrayList;
import java.util.Arrays;

/*
题目描述
在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
给定一个整数n，请返回n位的格雷码，顺序为从0开始。
测试样例：
1
返回：["0","1"]
 */
public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        String[] arr = null;
        if (n == 1 ) {
            arr = new String[]{"0","1"};
            return arr;
        }else {
            String[] strings = getGray(n-1);
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < strings.length; i++) {
                arrayList.add("0"+strings[i]);
            }
            for (int j = strings.length-1; j >= 0; j--) {
                arrayList.add("1"+strings[j]);
            }
            String[] arr_s = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                arr_s[i] = arrayList.get(i);
            }
            arr = arr_s;
        }
        return arr;
    }


    public static void main(String[] args) {
        GrayCode grayCode = new GrayCode();
        String[] strings = grayCode.getGray(7);
        System.out.println("最终结果：");
        System.out.println(Arrays.deepToString(strings));

    }
}
