package nowcoderPrimary;
/*题目描述
输入一个人的出生日期（包括年月日），将该生日中的年、月、日分别输出。
输入描述:
输入只有一行，出生日期，包括年月日，年月日之间的数字没有分隔符。
输出描述:
三行，第一行为出生年份，第二行为出生月份，第三行为出生日期。输出时如果月份或天数为1位数，需要在1位数前面补0。
示例1
输入
20130225
输出
year=2013
month=02
date=25

 */

import java.util.Scanner;

public class BirthdayFormat {
    public static void main(String[] args) {
        String year;
        String month;
        String day;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        year = str.substring(0,4);
        month = str.substring(4,6);
        day = str.substring(6,8);
        System.out.printf("year=%s\n",year);
        System.out.printf("month=%s\n",month);
        System.out.printf("day=%s\n",day);
    }
}
