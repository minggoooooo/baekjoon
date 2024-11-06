import java.util.*;

public class Main {
    static int[] time = new int[100001];  // 각 위치에 도달하는 시간
    static int[] count = new int[100001];  // 해당 시간에 도달할 수 있는 경로의 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subin = sc.nextInt();
        int bro = sc.nextInt();

        int[] result = bfs(subin, bro);
        System.out.println(result[0]);  // 최단 시간
        System.out.println(result[1]);  // 그 시간에 도달할 수 있는 경로의 수
    }

    static int[] bfs(int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        Arrays.fill(time, -1);  // 초기화 (방문하지 않은 곳은 -1로)
        Arrays.fill(count, 0);  // 초기화 (경로 수는 0으로 시작)

        queue.offer(start);
        time[start] = 0;
        count[start] = 1;  // 시작 지점은 1개의 경로로 도달

        while (!queue.isEmpty()) {
            int current = queue.poll();

            int[] nextPositions = {current - 1, current + 1, current * 2};
            for (int next : nextPositions) {
                if (next >= 0 && next <= 100000) {
                    // 방문하지 않았다면
                    if (time[next] == -1) {
                        time[next] = time[current] + 1;
                        count[next] = count[current];  // 새로운 경로 수는 현재 경로 수
                        queue.offer(next);
                    }
                    // 최단 시간에 도달했으면 경로 수 증가
                    else if (time[next] == time[current] + 1) {
                        count[next] += count[current];  // 경로 수 더함
                    }
                }
            }
        }
        return new int[]{time[target], count[target]};  // 최단 시간과 경로 수 반환
    }
}
