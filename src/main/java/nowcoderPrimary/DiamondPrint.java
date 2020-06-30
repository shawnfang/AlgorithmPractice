package nowcoderPrimary;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiamondPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        while ((s=bufferedReader.readLine())!=null){
            int n = Integer.parseInt(s);
            for (int i = n; i > 0 ; i--) {
                for (int j = i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = n-i; j >= 0 ; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            for (int i = n; i > 0 ; i--) {
                for (int j = n-i; j >= 0 ; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }
}
