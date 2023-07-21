import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean run = true;
		while(run) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			if(first==0&&second==0) {
				run=false;
				break;
			}
			if(first>second) {
				if(first%second==0) {
					System.out.println("multiple");
				}else {
					System.out.println("neither");
				}
			} else {
				if(second%first==0) {
					System.out.println("factor");
				}else {
					System.out.println("neither");
				}
			} 
		}
	}

}