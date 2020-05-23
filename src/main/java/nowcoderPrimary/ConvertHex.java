package nowcoderPrimary;
/*题目描述
BoBo写了一个十六进制整数ABCDEF，他问KiKi对应的十进制整数是多少。

输入描述:
无
输出描述:
十六进制整数ABCDEF对应的十进制整数，所占域宽为15。
备注:
printf可以使用使用格式控制串“%md”输出域宽为m的十进制整数。

 */
public class ConvertHex {
    public static void main(String[] args) {
        String hexStr= "ABCDEF";
        System.out.printf("%15d",Integer.parseInt(hexStr,16));
    }
}
