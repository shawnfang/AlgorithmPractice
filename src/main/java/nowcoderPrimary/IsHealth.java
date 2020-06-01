package nowcoderPrimary;

/*
题目描述
BMI指数（即身体质量指数）是用体重公斤数除以身高米数平方得出的数字，
是目前国际上常用的衡量人体胖瘦程度以及是否健康的一个标准。
例如：一个人的身高为1.75米，体重为68千克，他的BMI=68/(1.75^2)=22.2（千克/米^2）。
当BMI指数为18.5～23.9时属正常，否则表示身体存在健康风险。
编程判断人体健康情况。
输入描述:
一行，输入一个人的体重（千克）和身高（米），中间用一个空格分隔。
输出描述:
一行，输出身体Normal(正常)或Abnormal(不正常)。
示例1
输入
68 1.75
输出
Normal
示例2
输入
67.5 1.65
输出
Abnormal
 */

import java.util.Scanner;
public class IsHealth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            double weight = scanner.nextDouble();
            double tall = scanner.nextDouble();
            double bmi = weight/(Math.pow(tall,2));
            if(bmi>=18.5 && bmi <=23.9){
                System.out.println("Normal");
            }else {
                System.out.println("Abnormal");
            }
        }
    }
}
