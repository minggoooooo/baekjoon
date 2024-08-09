import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        int targetNum = Integer.parseInt(sc.nextToken());

        int count = 0;
        int movieNum = 665;
        boolean a = true;
        if(targetNum>10000|| targetNum<1){
            a = false;
        }

        while (a){
            String movie = Integer.toString(movieNum);

            if(movie.contains("666")){
                count++;
                if(count==targetNum){
                    System.out.println(movie);
                    break;
                }
            }
            movieNum++;


        }

    }
}