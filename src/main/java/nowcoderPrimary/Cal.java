package nowcoderPrimary;
/*
题目描述
请计算表达式“(-8+22)×a-10+c÷2”，其中，a = 40，c = 212。

输入描述:
无。
输出描述:
(-8+22)×a-10+c÷2计算之后的结果，为一个整数。
 */
public class Cal {
    public static void main(String[] args) {
        int a =40;
        int c =212;
        int x = (-8+22)*a-10+c/2;
        System.out.println(x);
    }
}
