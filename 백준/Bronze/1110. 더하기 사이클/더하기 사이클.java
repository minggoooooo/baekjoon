import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int arr = target;
        int count = 0;
        while (true){
            count++;
            int a = target / 10;
            int b = target % 10;
            int temp = a + b;
            target = (b*10) + (temp%10);
            if(target==arr){
                break;
            }
        }
        System.out.println(count);


    }

}
