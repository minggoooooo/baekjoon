import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        boolean [][] empty = new boolean[m][m];

        char a = '.';
        for(int i = 0; i < m; i++){
            String target = br.readLine();
            for(int j=0; j<target.length(); j++){
                if(target.charAt(j)==a){
                    empty[i][j]=true;
                }
            }
        }
        int row = 0;
        int col = 0;

        for(int i=0; i<m; i++){
            boolean lean = true;
            for(int j = 0; j< m-1; j++){
                if(empty[i][j]&&empty[i][j+1]&&lean){
                    lean = false;
                    row++;
                } else if(empty[i][j]!=empty[i][j+1]){
                    lean = true;
                }

            }

        }
        for(int i=0; i<m; i++){
            boolean lean = true;
            for(int j = 0; j< m-1; j++){
                if(empty[j][i]&&empty[j+1][i]&&lean){
                    lean = false;
                    col++;
                } else if(empty[j][i]!=empty[j+1][i]){
                    lean = true;
                }
            }
        }
        System.out.println(row + " " + col);
    }
}
