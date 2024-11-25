import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> end = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        int number = 1;
        while (true) {
            if(queue.contains(number)) {
                while (true){
                    if(queue.peek() == number){
                        end.add(queue.poll());
                        number++;
                        break;
                    } else {
                        stack.push(queue.poll());
                    }
                }
            } else if(!stack.isEmpty() && stack.peek()==number){
                end.add(stack.pop());
                number++;
            } else {
                System.out.println("Sad");
                break;
            }

            if(number-1==num){
                System.out.println("Nice");
                break;
            }

        }



    }

}
