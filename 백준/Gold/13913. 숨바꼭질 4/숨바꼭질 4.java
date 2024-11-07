import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] time = new int [100001];
    static int[] before  = new int [100001];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int subin = Integer.parseInt(st.nextToken());
        int bro = Integer.parseInt(st.nextToken());
        int min = bfs(subin,bro);
        System.out.println(min);
        showBefore(subin,bro);

    }

    static Integer bfs(int first, int target){
        Arrays.fill(time,-1);
        Arrays.fill(before,-1);
        time[first] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(first);
        while (!queue.isEmpty()){
            int origin = queue.poll();
            int[] nextElements = { origin * 2 , origin + 1 , origin - 1 };
            for(int next : nextElements){
                if(next>=0 && next<=100000){
                    if(time[next]==-1){
                        time[next] = time[origin]+1;
                        before[next] = origin;
                        queue.offer(next);
                    }
                }
            }
        }
        return time[target];
    }

    static void showBefore(int start, int target){
        Stack<Integer> stack = new Stack<>();
        for(int bf=target; bf !=start; bf =before[bf]){
            stack.push(bf);
        }
        stack.push(start);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }

}
