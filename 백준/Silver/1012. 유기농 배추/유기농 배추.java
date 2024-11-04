import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] field;
    static boolean[][] visited;
    static int row,col,cab;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* 테스트 횟수 */
        int testNum = Integer.parseInt(br.readLine());
        for (int i = 0 ;  i< testNum; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st2.nextToken());
            col = Integer.parseInt(st2.nextToken());
            cab = Integer.parseInt(st2.nextToken());

            field = new int[row][col];
            visited = new boolean[row][col];
            for(int j = 0; j < cab; j++){
                StringTokenizer st3 = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st3.nextToken());
                int y = Integer.parseInt(st3.nextToken());
                field[x][y] = 1;
            }
            int count =  0;

            for(int j = 0; j <row; j++){
                for(int k = 0; k<col; k++){
                    if(field[j][k] == 1 && !visited[j][k]){
                        dfs(j,k);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }



    }
    static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx >=0 && ny >= 0 && nx < row && ny < col){
                if (field[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
