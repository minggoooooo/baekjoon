import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            switch (num){
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.removeFirst()).append("\n");
                    }
                    break;
                case 4:
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.removeLast()).append("\n");
                    }
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    int number = deque.isEmpty()? 1 : 0 ;
                    sb.append(number).append("\n");
                    break;
                case 7 :
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;
                default:
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);


    }

}
