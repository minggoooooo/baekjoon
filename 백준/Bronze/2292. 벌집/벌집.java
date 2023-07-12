import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int sum=0;
		int b = 1;
		int count = 0;
		boolean run =true; //a가 8이면
		while(run) {
			b+=sum; //b는2
			count++;
			
			if(a<=b) { //a는8
				run=false;
			} else {
				sum+=6;
			}
		}
		System.out.println(count);
	}
}
