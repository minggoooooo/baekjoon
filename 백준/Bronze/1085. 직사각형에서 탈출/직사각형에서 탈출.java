import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int out1= c-a;
		int out2= a-0;
		int out3= d-b;
		int out4= b-0;
		int min=out1;
		if(min>out2) {
			min= out2;
		}
		if(min>out3) {
			min= out3;
		}
		if(min>out4) {
			min= out4;
		}
		System.out.println(min);
		

	}

}
