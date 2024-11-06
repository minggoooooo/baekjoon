import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] time = new int [100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int subin = Integer.parseInt(st.nextToken());
        int bro = Integer.parseInt(st.nextToken());

        System.out.println(bfs(subin,bro));

    }

    static int bfs(int target, int targetNum){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(target);
        time[target] = 1;

        while (!queue.isEmpty()){
            int current = queue.poll();
            if(current == targetNum){
                return time[current] - 1;
            }
            int[] nextPositions = {current - 1 , current + 1 , current * 2};
            for(int next : nextPositions){
                if(next >= 0  && next<=100000 && time[next] ==0){
                    time[next] = time[current] + 1;
                    queue.offer(next);
                }
            }
        }
        return -1;

    }

}
