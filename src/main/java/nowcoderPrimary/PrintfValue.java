package nowcoderPrimary;
/*题目描述
KiKi写了一个输出“Hello world!”的程序，BoBo老师告诉他printf函数有返回值，你能帮他写个程序输出printf(“Hello world!”)的返回值吗？
输入描述:
无
输出描述:
包括两行：
第一行为“Hello world!”
第二行为printf(“Hello world!”)调用后的返回值。

 */
public class PrintfValue {
    public static void main(String[] args) {
        String str = "Hello,world!";
        System.out.println(str);
        System.out.println(str.length());
    }
}
