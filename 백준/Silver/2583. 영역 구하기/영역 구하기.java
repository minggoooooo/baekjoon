import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] square;
    static boolean[][] visited;
    static boolean[][] unvisited;
    static int row,col, sq;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* 테스트 횟수 */

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st2.nextToken());    //세로
        row = Integer.parseInt(st2.nextToken());    //가로
        sq = Integer.parseInt(st2.nextToken()); //네모개수

        square = new int[row + 1][col + 1];
        visited = new boolean[row + 1][col + 1];
        unvisited = new boolean[row + 1][col + 1];
        for(int j = 0; j < sq; j++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st3.nextToken()) + 1;
            int y = Integer.parseInt(st3.nextToken()) + 1;
            int x2 = Integer.parseInt(st3.nextToken());
            int y2 = Integer.parseInt(st3.nextToken());
            for(int i = x; i<=x2; i++){
                for(int k= y; k<=y2; k++){
                    square[i][k] = 1;
                }
            }
        }

        for(int j = 1; j <=row; j++){
            for(int k = 1; k<=col; k++){
                if(square[j][k] == 1 && !visited[j][k]){
                    dfs(j,k);
                }
            }
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> unvisitedList = new ArrayList<>();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(square[i][j]==0 && !unvisited[i][j]){
                    int k = undfs(i,j,0);
                    count++;
                    unvisitedList.add(k);
                }
            }
        }
        System.out.println(count);
        Collections.sort(unvisitedList);
        for(int i = 0 ; i<unvisitedList.size(); i ++){
            sb.append(unvisitedList.get(i));
            if(i != unvisitedList.size()-1){
                sb.append(" ");
            }
        }
        System.out.println(sb);


    }
    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx >=1 && ny >= 1 && nx <= row && ny <= col){
                if (square[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
    static Integer undfs(int x, int y, int c){
        unvisited[x][y] = true;
        c++;
        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx >=1 && ny >= 1 && nx <= row && ny <= col){
                if (square[nx][ny] == 0 && !unvisited[nx][ny]) {
                    c = undfs(nx, ny,c);
                }
            }
        }
        return c;
    }
}
