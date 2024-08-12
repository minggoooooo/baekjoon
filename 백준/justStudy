package hello.core;

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
        HashMap<Integer,String> dictionary = new HashMap<>();
        for(int i=0; i<poke; i++){
            String name = br.readLine();
            dictionary.put(i+1,name);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<questions; i++){
            String question = br.readLine();
            if(isNumeric(question)){
                sb.append(dictionary.get(Integer.parseInt(question))).append("\n");
            } else {
               sb.append(getKeyValue(dictionary,question)).append("\n");
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

    private static Integer getKeyValue(HashMap<Integer,String> map, String value){
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            if(entry.getValue().equals(value)){
                return entry.getKey();
            }
        }
        return null;
    }
}
