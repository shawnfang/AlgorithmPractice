package nowcodeDataStructures;
/*
打字
时间限制 :1sec / 空间限制: 256MB

题意：
牛妹在练习打字，现在按照时间顺序给出牛妹按下的键（以字符串形式给出,'<'代表回退backspace，
其余字符均是牛妹打的字符，字符只包含小写字母与'<'），牛妹想知道最后在屏幕上显示的文本内容是什么。
在文本内容为空的时候也可以按回退backspace（在这种情况下没有任何效果）。

输入：
给定一个字符串s，代表牛妹所按下的按键。
1<s.length≤10^5
输出：
返回一个字符串代表最后在屏幕上显示的文本内容。
若为空则返回一个空串。
示例1
输入
"acv<"
输出
"ac"
说明
牛妹在打完"acv"之后按了回退，所以最后是"ac"
 */
import java.util.*;
public class TypingPrint {
    /**
     *
     * @param s string字符串
     * @return string字符串
     */
    public String Typing (String s) {
        // write code here
        StringBuilder result = new StringBuilder();
        char[] save = s.toCharArray();
        for (int i = 0; i < save.length; i++) {
            if (save[i] == '<') {
                if (result.length() != 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            }else {
                    result.append(save[i]);
                }
            }
        return result.toString();
    }

    public static void main(String[] args) {
        TypingPrint typingPrint = new TypingPrint();
        String s = "<";
        System.out.println(typingPrint.Typing(s));
    }
}
