import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String munjayeol = br.readLine();
            if(munjayeol.equals(".")){
                break;
            }
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(int j=0; j<munjayeol.length(); j++){
                if(munjayeol.charAt(j)==')'){
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    } else if(stack.isEmpty()||stack.peek()=='['){
                        System.out.println("no");
                        check=false;
                        break;
                    }

                } else if(munjayeol.charAt(j)==']'){
                    if(!stack.isEmpty() && stack.peek()=='['){
                        stack.pop();
                    } else if(stack.isEmpty()||stack.peek()=='('){
                        System.out.println("no");
                        check=false;
                        break;
                    }
                } else if(munjayeol.charAt(j)=='['||munjayeol.charAt(j)=='('){
                    stack.push(munjayeol.charAt(j));
                }
            }
            if(stack.isEmpty() && check){
                System.out.println("yes");
            } else if(check){
                System.out.println("no");
            }
        }



    }

}
