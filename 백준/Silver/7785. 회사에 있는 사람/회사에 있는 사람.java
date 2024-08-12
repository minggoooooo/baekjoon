import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());  //로그 수
        HashMap<String,Boolean> commuter = new HashMap<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String status = st.nextToken();

            if(status.equals("enter")){
                commuter.put(person,true);
            } else{
                commuter.remove(person);
            }
        }
        ArrayList<String> enteredEmployees = new ArrayList<>(commuter.keySet());
        Collections.sort(enteredEmployees);
        Collections.reverse(enteredEmployees);

        StringBuilder sb = new StringBuilder();
        for(String person: enteredEmployees){
            sb.append(person).append("\n");
        }
        System.out.println(sb);

    }
}