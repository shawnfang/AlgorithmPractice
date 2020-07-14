package nowcodeAlgorithms;
/*
题目描述
现在有一栋高楼，但是电梯却出了故障，无奈的你只能走楼梯上楼，根据你的腿长，你一次能走1级或2级楼梯，
已知你要走n级楼梯才能走到你的目的楼层，请计算你走到目的楼层的方案数，由于楼很高，所以n的范围为int范围内的正整数。
给定楼梯总数n，请返回方案数。为了防止溢出，请返回结果Mod 1000000007的值。
测试样例：
3
返回：3
 */

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        if (n == 1) {
            return  1;
        }
        if (n == 2) {
            return  2;
        }
        return  (countWays(n-1)+countWays(n-2))%1000000007;
    }

    public static void main(String[] args) {
        GoUpstairs goUpstairs = new GoUpstairs();
        System.out.println(goUpstairs.countWays(2));
    }
}
