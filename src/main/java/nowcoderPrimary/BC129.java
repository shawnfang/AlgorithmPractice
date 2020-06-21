package nowcoderPrimary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BC129 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        double a =  Integer.parseInt(string.split(" ")[0]);
        double b =  Integer.parseInt(string.split(" ")[1]);
        double c =  Integer.parseInt(string.split(" ")[2]);
        double finalcal = (getMax(a+b,b,c))/(getMax(a,b+c,c)+getMax(a,b,b+c));
        System.out.printf("%.2f",finalcal);
    }
    public static double getMax(double a, double b, double c) {
        double max=a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
