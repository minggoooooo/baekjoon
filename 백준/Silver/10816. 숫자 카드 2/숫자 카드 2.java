import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //상근이의 숫자카드 개수
        StringTokenizer st= new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();   //키는 숫자 밸류는 횟수
        for (int i=0; i< N; i++){
            int num = Integer.parseInt(st.nextToken()); // 숫자 잘랐음
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        int M = Integer.parseInt(br.readLine());    // 정수 개수
        StringTokenizer st2= new StringTokenizer(br.readLine());    //정수 리스트 담을 토크나이저
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            int targetNum = Integer.parseInt(st2.nextToken());
            if(map.containsKey(targetNum)){
                sb.append(map.get(targetNum)).append(" ");
            } else{
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);

    }
}
