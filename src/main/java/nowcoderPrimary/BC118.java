package nowcoderPrimary;


/*
题目描述
老师给了小乐乐一个正整数序列，要求小乐乐把这个序列去重后按从小到大排序。但是老师给出的序列太长了，小乐乐没办法耐心的去重并排序，请你帮助他。
输入描述:
第一行包含一个正整数n，表示老师给出的序列有n个数。接下来有n行，每行一个正整数k，为序列中每一个元素的值。(1 ≤ n ≤ 105，1 ≤ k ≤ n)
输出描述:
输出一行，为去重排序后的序列，每个数后面有一个空格。
示例1
输入
4
2
2
1
1
输出
1 2
示例2
输入
5
5
4
3
2
1
输出
1 2 3 4 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class BC118 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        int n = Integer.parseInt(bufferedReader.readLine());
        int count=0;
        String s;
        while ((s=bufferedReader.readLine())!=null){
            stringBuffer.append(s);
            stringBuffer.append("\n");
            count++;
            if (count == n) {
                break;
            }
        }
        Set<Integer> set = new TreeSet<>();
        for (String s1:stringBuffer.toString().split("\n")){
            set.add(Integer.parseInt(s1));
        }
        Iterator it =set.iterator();
        while (it.hasNext()){
            int next = (int) it.next();
            stringBuffer1.append(next+" ");
            }
        System.out.println(stringBuffer1);
        }
    }

