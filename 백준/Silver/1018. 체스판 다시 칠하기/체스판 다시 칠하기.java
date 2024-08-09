
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(sc.nextToken());
        int b = Integer.parseInt(sc.nextToken());
        char[][] arr = new char[a][b];

        for (int i = 0; i < a; i++) {
            String c = br.readLine();
            for (int j = 0; j < b; j++) {
                arr[i][j] = c.charAt(j);
            }
        }

        ArrayList<Integer> minlist = new ArrayList<>();

        for (int c = 0; c <= a - 8; c++) {
            for (int d = 0; d <= b - 8; d++) {
                int count = 0;

                // 8x8 영역 확인
                for (int i = c; i < c + 8; i++) {
                    for (int j = d; j < d + 8; j++) {
                        char expectedColor = (i + j) % 2 == 0 ? 'B' : 'W';
                        if (arr[i][j] != expectedColor) {
                            count++;
                        }
                    }
                }
                if(count>32){
                    count = 64 -count;
                }
                minlist.add(count);
            }
        }

        minlist.sort(Integer::compareTo);

        // 최소값과 최대값 출력
        if (!minlist.isEmpty()) {
            System.out.println(minlist.get(0));
        }
    }
}