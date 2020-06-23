package nowcoderPrimary;

/*
题目描述
小乐乐比较懒惰，他现在想睡觉，然后再去学习。他知道现在的时刻，以及自己要睡的时长，
想设定一个闹钟叫他起床学习，但是他太笨了，不知道应该把闹钟设定在哪个时刻，请你帮
助他。(只考虑时和分，不考虑日期)
输入描述:
输入现在的时刻以及要睡的时长k（单位：minute），中间用空格分开。
输入格式：hour:minute k(如hour或minute的值为1，输入为1，而不是01)
(0 ≤ hour ≤ 23，0 ≤ minute ≤ 59，1 ≤ k ≤ 109)
输出描述:
对于每组输入，输出闹钟应该设定的时刻，输出格式为标准时刻表示法（即时和分都是由两位表示，位数不够用前导0补齐）。
示例1
输入
0:0 100
输出
01:40
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BC113 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int nowHour = Integer.parseInt(s.split(":")[0]);
        int nowMinute = Integer.parseInt(s.split(":")[1].split(" ")[0]);
        int sleeptime = Integer.parseInt(s.split(" ")[1]);
        int hour = 0;
        int minute = 0;
        if (sleeptime/60 >= 24) {
            hour = (sleeptime%(60*24))/60+nowHour;
            minute = sleeptime%60%60+nowMinute;
        }else {
            hour = sleeptime/60+nowHour;
            minute = sleeptime%60+nowMinute;
        }
        if (hour>=24) {
            hour = hour%24;
        }
        if (minute/60 >= 1) {
            hour = minute/60+hour;
            minute = minute%60;
        }
        String minutes = String.valueOf(minute);
        String hours = String.valueOf(hour);
        if (hour < 10) {
            hours = "0"+String.valueOf(hour);
        }
        if (minute < 10) {
            minutes = "0"+String.valueOf(minutes);
        }
        System.out.println(hours+":"+minutes);

    }
}
