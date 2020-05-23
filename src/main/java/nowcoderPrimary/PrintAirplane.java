package nowcoderPrimary;
/*题目描述
KiKi学会了printf在屏幕输出信息，他想输出一架小飞机。请帮他编写程序输出这架小飞机。
输入描述:
无
输出描述:


 */
public class PrintAirplane {
    public static void main(String[] args) {
        String[] a = new String[12];
        String[] b = new String[12];
        String[] c = new String[12];
        for (int m=0;m<2;m++) {
            for (int i = 0; i < a.length; i++) {
                if (i == 5 || i == 6) {
                    a[i] = "*";
                } else {
                    a[i] = " ";
                }
            }
            StringBuffer str = new StringBuffer();
            for (String s : a) {
                str.append(s);
            }
            System.out.println(str);
        }
        for (int x=0;x<2;x++) {
            for (int n = 0; n < b.length; n++) {
                b[n] = "*";
            }
            StringBuffer str1 = new StringBuffer();
            for (String bs : b) {
                str1.append(bs);
            }
            System.out.println(str1);
        }
        for (int y=0;y<2;y++) {
            for (int i = 0; i < a.length; i++) {
                if (i == 4 || i == 7) {
                    c[i] = "*";
                } else {
                    c[i] = " ";
                }
            }
            StringBuffer str2 = new StringBuffer();
            for (String s : c) {
                str2.append(s);
            }
            System.out.println(str2);
        }
    }
}
