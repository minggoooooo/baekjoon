import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());    //1번 집합
        int m = Integer.parseInt(st.nextToken());    //2번집합
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();   //중복되면 제거할것
        st = new StringTokenizer(br.readLine());    //초기화
        for (int i=0; i< n; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num,true);
        }

        st = new StringTokenizer(br.readLine());    //초기화
        for(int i=0; i<m; i++){
            int num = Integer.parseInt(st.nextToken());
            if(map.get(num)!=null){
                map.remove(num);
            } else {
                map.put(num, true);
            }
        }
        System.out.println(map.size());
    }
}
