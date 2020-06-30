package nowcoderPrimary;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        double sum = 0;
        String[][] strings = new String[5][5];
        for (int i = 0; i < 5; i++) {
            strings[i] = bufferedReader.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                sum += Double.valueOf(strings[i][j]);
                stringBuffer.append(strings[i][j]+" ");
            }
            stringBuffer.append(sum);
            stringBuffer.append("\n");
            sum = 0;
        }
        System.out.println(stringBuffer);
    }
}