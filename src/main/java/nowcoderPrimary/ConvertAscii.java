package nowcoderPrimary;


/*
题目描述
BoBo教KiKi字符常量或字符变量表示的字符在内存中以ASCII码形式存储。BoBo出了一个问题给KiKi，转换以下ASCII码为对应字符并输出他们。
73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116 , 33
输入描述:
无
输出描述:
转换输出题目中给出的所有ASCII到对应的字符。
 */
public class ConvertAscii {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] ints = {73,32,99,97,110,32,100,111,32,105,116,33};
        for (int i = 0; i < ints.length; i++) {
            stringBuffer.append(Character.toString(ints[i]));
        }
        System.out.println(stringBuffer);
    }
}
