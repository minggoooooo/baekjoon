import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();  // 비교할 문자
        int num=1;
        HashMap<String,Boolean> munjayeol = new HashMap<>();
        while (num<=target.length()){
            for(int i=0; i<=target.length()-num;i++){
                munjayeol.put(target.substring(i,num+i),true);
            }
            num++;
        }
        System.out.println(munjayeol.size());
    }
}
