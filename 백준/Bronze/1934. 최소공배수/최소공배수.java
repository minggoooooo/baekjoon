import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = findGCD(a, b);
            System.out.println((a/gcd)*(b/gcd)*gcd);
        }

    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // 나머지를 b에 저장
            a = temp;  // a에 b를 저장
        }
        return a; // 마지막에 남은 a가 최대공약수
    }

}
