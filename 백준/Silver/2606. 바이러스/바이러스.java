import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] adjList; // 그래프의 인접 리스트
    static boolean[] visited; // 방문 여부 체크 배열
    static void dfs(int node) {
        visited[node] = true;
        for (int neighbor : adjList[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] passiveArr = new boolean[101];

        /* 정점의 개수 */
        int passive = Integer.parseInt(br.readLine());
        /* 간선의 개수 */
        int active = Integer.parseInt(br.readLine());

        adjList = new ArrayList[passive + 1];
        visited = new boolean[passive + 1];
        for (int i = 1; i <= passive; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < active; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st2.nextToken());
            int second = Integer.parseInt(st2.nextToken());
            adjList[first].add(second);
            adjList[second].add(first);
        }



        int count = 0;

        dfs(1);
        for (int i = 2; i <= passive; i++) {
           if(visited[i]){
               count++;
           }
        }


        System.out.println(count);

    }
}
