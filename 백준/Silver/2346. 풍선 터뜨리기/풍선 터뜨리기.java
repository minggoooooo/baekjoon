import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            sb.append(current[0]).append(" ");
            if (deque.isEmpty()) break;

            int move = current[1];
            if (move > 0) {
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}
