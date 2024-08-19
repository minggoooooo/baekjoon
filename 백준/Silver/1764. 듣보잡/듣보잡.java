import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());    //듣잡의 수
        int m = Integer.parseInt(st.nextToken());    //보잡의 수
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();   //키는 이름 밸류는 T/F
        for (int i=0; i< n; i++){
            String name = br.readLine();
            map.put(name,true);
        }

        StringBuilder sb = new StringBuilder();
        HashMap<String,Boolean> dbjob = new HashMap<>();
        for(int i=0; i<m; i++){
            String name = br.readLine();
            if(map.get(name) != null){
                dbjob.put(name,true);
            }
        }
        System.out.println(dbjob.size());
        String[] names = new String[dbjob.size()];
        dbjob.keySet().toArray(names);
        Arrays.sort(names);
        for (String name : names){
            System.out.println(name);
        }
    }
}
