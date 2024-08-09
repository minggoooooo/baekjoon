import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        int targetNum = Integer.parseInt(sc.nextToken());

        int[] arr = {1,2,4,7};

        for (int j : arr) {
            if (j == targetNum) {
                System.out.println(-1);
                return;
            }
        }
        int max = targetNum/5;

        if(targetNum%5 ==0){
            System.out.println(max);
        } else if (targetNum%5 ==3) {
            System.out.println(max+1);
        } else {
            max--;
            int targetNum2 = targetNum - max*5;
            if(targetNum2 % 3 ==0){
                System.out.println(max + targetNum2/3);
            } else{
                max--;
                int targetNum3 = targetNum - max*5;
                System.out.println(max + targetNum3/3);
            }
        }


    }
}