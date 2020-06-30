package nowcoderPrimary;

/*
题目描述
KiKi访问网站，得到HTTP状态码，但他不知道什么含义，BoBo老师告诉他常见HTTP状态码：200（OK，请求已成功），
202（Accepted，服务器已接受请求，但尚未处理。）400（Bad Request，请求参数有误），
403（Forbidden，被禁止），404（Not Found，请求失败），500（Internal Server Error，服务器内部错误），
502（Bad Gateway，错误网关）。
输入描述:
多组输入，一行，一个整数（100~600），表示HTTP状态码。
输出描述:
针对每组输入的HTTP状态，输出该状态码对应的含义，具体对应如下：
200-OK
202-Accepted
400-Bad Request
403-Forbidden
404-Not Found
500-Internal Server Error
502-Bad Gateway
示例1
输入
200
输出
OK
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RequestCode {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        while ((string = bufferedReader.readLine())!=null){
            int code = Integer.parseInt(string);
            if (code == 200) {
                System.out.println("OK");
            }else if (code == 202) {
                System.out.println("Accepted");
            }else if (code == 400) {
                System.out.println("Bad Request");
            }else if (code == 403) {
                System.out.println("Forbidden");
            }else if(code == 404){
                System.out.println("Not Found");
            }else if (code == 500) {
                System.out.println("Internal Server Error");
            }else if (code == 502) {
                System.out.println("Bad Gateway");
            }
        }
    }
}
