package nowcoderPrimary;
/*
题目描述
变种水仙花数 - Lily Number：把任意的数字，从中间拆分成两个数字，比如1461 可以拆分成（1和461）,（14和61）,（146和1),
如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
例如：
655 = 6 * 55 + 65 * 5
1461 = 1*461 + 14*61 + 146*1
求出 5位数中的所有 Lily Number。
输入描述:
无
输出描述:
一行，5位数中的所有 Lily Number，每两个数之间间隔一个空格。
 */
public class BreakLocationIterator {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        for (int i = 10000;i>=10000 && i<=99999; i++) {
            String s = String.valueOf(i);
            char[] c = s.toCharArray();
            int num0 = Integer.parseInt(String.valueOf(c[0]));
            int num1 = Integer.parseInt(String.valueOf(c[1])+String.valueOf(c[2])+String.valueOf(c[3])+String.valueOf(c[4]));
            int num2 = Integer.parseInt(String.valueOf(c[0])+String.valueOf(c[1]));
            int num3 = Integer.parseInt(String.valueOf(c[2])+String.valueOf(c[3])+String.valueOf(c[4]));
            int num4 = Integer.parseInt(String.valueOf(c[0])+String.valueOf(c[1])+String.valueOf(c[2]));
            int num5 = Integer.parseInt(String.valueOf(c[3])+String.valueOf(c[4]));
            int num6 = Integer.parseInt(String.valueOf(c[0])+String.valueOf(c[1])+String.valueOf(c[2])+String.valueOf(c[3]));
            int num7 = Integer.parseInt(String.valueOf(c[4]));
            if(num0*num1+num2*num3+num4*num5+num6*num7==i){
                str.append(i+" ");
            }
        }
        System.out.println(str);
    }
}
