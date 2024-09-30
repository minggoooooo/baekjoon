import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i< n; i++) {
            long k = Long.parseLong(br.readLine());
            while (!isPrime(k)) {
                k++; // 소수가 아닐 경우, n을 증가시킴
            }
            sb.append(k).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean isPrime(long num) {
        if (num <= 1) return false; // 1 이하의 수는 소수가 아님
        if (num <= 3) return true;  // 2와 3은 소수
        if (num % 2 == 0 || num % 3 == 0) return false; // 2와 3으로 나누어 떨어지면 소수가 아님

        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false; // 6k ± 1 형태로 검사
        }
        return true;
    }
}
