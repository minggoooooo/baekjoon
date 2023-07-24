import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int a1 = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		int b1 = Integer.parseInt(st1.nextToken());
		int c = Integer.parseInt(st2.nextToken());
		int c1 = Integer.parseInt(st2.nextToken());
		int d;
		int d1;
		
		if(a==b) {
			d=c;
		}else if(a==c) {
			d=b;
		}else {
			d=a;
		}
		
		if(a1==b1) {
			d1=c1;
		}else if(a1==c1) {
			d1=b1;
		}else {
			d1=a1;
		}
		
		System.out.println(d + " " + d1);
		
		
		

	}

}