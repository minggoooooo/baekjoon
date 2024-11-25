import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());



        for(int i=0; i<num; i++){
            String munjayeol = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(int j=0; j<munjayeol.length(); j++){
                if(munjayeol.charAt(j)==')'){
                    if(stack.isEmpty()){
                        System.out.println("NO");
                        check = false;
                        break;
                    }
                    stack.pop();
                } else {
                    stack.push(munjayeol.charAt(j));
                }
            }
            if(!stack.isEmpty()){
                System.out.println("NO");
            } else if(check){
                System.out.println("YES");
            }

        }



    }

}
