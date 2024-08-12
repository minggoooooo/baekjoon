import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());  //상근이의 카드 개수
        int second = Integer.parseInt(st.nextToken());
        String [] firstWord = new String[first];
        String [] secondWord = new String[second];
        for(int i=0; i<firstWord.length; i++){
            firstWord[i] = br.readLine();
        }
        for(int i=0; i<secondWord.length; i++){
            secondWord[i] = br.readLine();
        }
        HashMap<String,Integer> comparion = new HashMap<>();
        for(String i : firstWord){
            comparion.put(i , 1);
        }
        int count = 0;
        for(String i : secondWord){
            if(comparion.get(i) != null){
                count++;
            } 
        }
        System.out.println(count);

    }
}