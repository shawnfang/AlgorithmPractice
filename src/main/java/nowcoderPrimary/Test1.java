package nowcoderPrimary;


import java.util.*;

public class Test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = sc.nextLine();
        while(count-- > 0){
            str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            char[] arr = str.toCharArray();
            for(char c : arr){
                if(c >= '0' && c <= '9')
                    sb.append(c);
            }
            if(sb.length() == 0){
                System.out.println("0");
                continue;
            }
            System.out.println(sb.toString());
            int num = new Integer(sb.toString());
            System.out.println(num);
            if (num == 0) {
                System.out.println("0");
                continue;
            }
            int res = 0;
            for(int i=2;i<Math.sqrt(num);){
                if(num % i == 0){
                    num = num / i;
                    res = Math.max(res,i);
                }else{
                    i++;
                }
            }
            System.out.println(res);
            System.out.println(num);
            res = Math.max(res,num);
            System.out.println(res);
        }
    }

}

