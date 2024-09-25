import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] positions = new int[n];

        for (int i = 0; i < n; i++) {
            positions[i] = Integer.parseInt(br.readLine());
        }

        // 간격 배열 생성
        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            gaps[i] = positions[i + 1] - positions[i];
        }

        // 간격의 최대공약수 계산
        int gcd = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcd = findGCD(gcd, gaps[i]);
        }

        // 필요한 집 개수 계산  //4 6 6
        int count = 0;
        for (int gap : gaps) {
            count += (gap / gcd) - 1; // gap을 gcd로 나눈 몫에서 1을 뺌
        }
        System.out.println(count);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
