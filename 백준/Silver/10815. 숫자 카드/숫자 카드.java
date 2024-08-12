import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sangNum = Integer.parseInt(br.readLine());  //상근이의 카드 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] sangCard = new int[sangNum];
        for(int i=0; i<sangCard.length; i++){
            sangCard[i] = Integer.parseInt(st.nextToken());
        }
        int compNum= Integer.parseInt(br.readLine());
        int [] compCard = new int[compNum];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<compCard.length; i++){
            compCard[i] = Integer.parseInt(st.nextToken());
        }
        HashMap<Integer,Integer> comparion = new HashMap<>();
        for(int i : sangCard){
            comparion.put(i , 1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i : compCard){
            if(comparion.get(i) == null){
                sb.append(0).append(" ");
            } else {
                sb.append(comparion.get(i)).append(" ");
            }
        }
        System.out.println(sb);

    }
}