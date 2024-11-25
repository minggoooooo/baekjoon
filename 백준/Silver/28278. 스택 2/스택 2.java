import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] tomatos;
    static boolean[][] checks;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int row,col;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();

        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            switch (input){
                case 1 :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2 :
                    if(!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case 3 :
                    System.out.println(stack.size());
                    break;
                case 4 :
                    if(stack.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case 5 :
                    if(!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;

            }
        }


    }

}
