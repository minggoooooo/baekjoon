import java.io.IOException;
import java.util.Scanner;

public class Main {
    static char[][] colors;
    static int[][] numColors;
    static boolean[][] checks;
    static int num;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        colors = new char[num + 1][num + 1];
        numColors = new int[num + 1][num + 1];  //1은 r 2는 g 3은 b
        checks = new boolean[num + 1][num + 1];
        for(int i = 1; i<= num; i++){
            String row = sc.next();
            for(int k = 0; k < num; k++){
                colors[i][k+1] = row.charAt(k);
            }
        }
        StringBuilder sb = new StringBuilder();
        int number = 0;
        for(int i = 1; i<= num; i++){
            for(int k = 1; k <= num; k++){
                if(!checks[i][k]){
                    dfs(i,k,false);
                    number++;

                }
            }
        }

        sb.append(number).append(" ");
        numColors = new int[num + 1][num + 1];  //1은 r 2는 g 3은 b
        checks = new boolean[num + 1][num + 1];
        number = 0;
        for(int i = 1; i<= num; i++){
            for(int k = 1; k <= num; k++){
                if(!checks[i][k]){
                    dfs(i,k,true);
                    number++;
                }
            }
        }
        sb.append(number);
        System.out.println(sb);


    }
    static void dfs(int x, int y , boolean disable){
        numColors[x][y] = colorNum(colors[x][y],disable);
        checks[x][y] = true;
        int comp = numColors[x][y];
        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx >=0 && ny >= 0 && nx <= num && ny <= num){
                if(colorNum(colors[nx][ny],disable)==comp && !checks[nx][ny]){
                    dfs(nx,ny,disable);
                }
            }
        }
    }
    static Integer colorNum(char a, boolean disable){
        if(a=='R'){
            return 1;
        } else if(a=='G' && disable){
            return 1;
        } else if(a=='G'){
            return 2;
        } else if (a=='B') {
            return 3;
        } else {
            return 0;
        }
    }
}
