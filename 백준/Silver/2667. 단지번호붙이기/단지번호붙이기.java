import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int num;
    static int[][] houses;
    static boolean[][] ishouse;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        houses = new int[num+1][num+1];
        ishouse = new boolean[num+1][num+1];
        for(int i = 1; i <= num; i++){
            String row = sc.next();
            for(int j=0; j< num; j++){
                houses[i][j+1] = row.charAt(j) - '0';
            }
        }
        ArrayList<Integer> numlist = new ArrayList<>();
        int iter = 0;

        for(int i = 1; i <= num; i++){
            for(int j=1; j<= num; j++){
                if(houses[i][j]==1 && !ishouse[i][j]){
                    iter++;
                    int count = dfs(i,j,1);
                    numlist.add(count);
                }
            }
        }
        Collections.sort(numlist);
        System.out.println(iter);
        for (Integer integer : numlist) {
            System.out.println(integer);
        }



    }
    static Integer dfs(int x, int y,int count){
        if(houses[x][y]==1) {
            ishouse[x][y] = true;
        }
        for(int i=0; i<4; i++){
            int x1 = x + dx[i];
            int y1 = y + dy[i];
            if(x1>=1 && y1>=1 && x1<=num && y1<=num){
                if(!ishouse[x1][y1] && houses[x1][y1]==1) {
                    count++;
                    count = dfs(x1, y1, count);
                }
            }
        }
        return count;
    }

}
