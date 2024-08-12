import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int poke = Integer.parseInt(st.nextToken());  // 입력할 포켓몬 수
        int questions = Integer.parseInt(st.nextToken());  //질문 수
        String[]pokes = new String[poke];
        HashMap<String ,Integer> dictionary = new HashMap<>();
        for(int i=0; i<poke; i++){
            String name = br.readLine();
            dictionary.put(name,i+1);
            pokes[i]=name;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<questions; i++){
            String question = br.readLine();
            if(isNumeric(question)){
                sb.append(pokes[Integer.parseInt(question)-1]).append("\n");
            } else {
                sb.append(dictionary.get(question)).append("\n");
            }
        }
        System.out.println(sb);
        br.close();

    }
    private static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
