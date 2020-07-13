package nowcodeDataStructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RussiaGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        int[] arr = new int[n];
        int temp;
        String[] strings1 = bufferedReader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            arr[Integer.parseInt(strings1[i])-1]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(arr[0]);
    }
}