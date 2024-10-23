import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int channel = Integer.parseInt(br.readLine());
        ArrayList<String> channelList = new ArrayList<>();
        int kbs1 = 0;
        int kbs2 = 0;
        for(int i= 0; i < channel; i++){
            String name = br.readLine();
            channelList.add(name);
            if(name.equals("KBS1")){
                kbs1=i;
            } else if (name.equals("KBS2")) {
                kbs2=i;
            }
        }
        if(kbs1>kbs2){
            for(int i = 0; i<kbs1; i++){
                sb.append(1);
            }
            for(int i = 0; i<kbs1; i++){
                sb.append(4);
            }
            for(int i = 0; i<kbs2+1; i++){
                sb.append(1);
            }
            for(int i =0 ; i<kbs2; i++){
                sb.append(4);
            }
        } else {
            for(int i = 0; i<kbs1; i++){
                sb.append(1);
            }
            for(int i = 0; i<kbs1; i++){
                sb.append(4);
            }
            for(int i = 0; i<kbs2; i++){
                sb.append(1);
            }
            for(int i =0 ; i<kbs2-1; i++){
                sb.append(4);
            }
        }
        System.out.println(sb);


    }

}
