import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String q = st.nextToken();
            if(q.equals("push")){
                queue.offer(Integer.parseInt(st.nextToken()));
            } else if(q.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            }else if(q.equals("size")){
                sb.append(queue.size()).append("\n");
            }else if(q.equals("empty")){
                if(queue.isEmpty()){
                   sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }else if(q.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            }else if(q.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    int lastElement = ((LinkedList<Integer>) queue).getLast();
                   sb.append(lastElement).append("\n");
                }
            }

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}
