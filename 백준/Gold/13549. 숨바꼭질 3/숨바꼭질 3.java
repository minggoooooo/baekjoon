import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] time = new int[100001];  // 각 위치에 도달하는 시간
    static int[] count = new int[100001];  // 해당 시간에 도달할 수 있는 경로의 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int subin = Integer.parseInt(st.nextToken());
        int bro = Integer.parseInt(st.nextToken());

        System.out.println(bfs(subin,bro));

    }

    static int bfs(int first, int target){
        Arrays.fill(time,-1);
        Arrays.fill(count, 0);
        time[first] = 0;
        count[first] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(first);
        while (!queue.isEmpty()){
            int current = queue.poll();
            int[] nextPostions = {current*2, current-1 , current+1 };
            for(int next : nextPostions){
                if(next>=0 && next<=100000){
                    if(next == current * 2){
                        if(time[next] == -1){
                            time[next] = time[current];
                            count[next] = count[current];
                            queue.offer(next);
                        } else if (time[next] == time[current] + 1) {
                            count[next] = count[current] + 1 ;
                            queue.offer(next);
                        }
                    } else if(time[next] == -1){
                        time[next] = time[current] + 1;
                        count[next] = count[current];
                        queue.offer(next);
                    } else if (time[next] == time[current] + 1) {
                        count[next] = count[current] + 1 ;
                        queue.offer(next);
                    }
                }
            }
        }
        return time[target];
    }

}
