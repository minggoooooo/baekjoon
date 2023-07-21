import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count =0; // 약수카운터
		int targetnum = 0; // 갯수세는용
		boolean run =true;
		int num1 = Integer.parseInt(br.readLine());//시작점
		
		while(run) {
			if(num1==1) {
				run=false;
			}
			for(int i=2; i<num1+1; i++) {
				if(num1%i==0) {
					num1/=i;
					System.out.println(i);
					break;
				}
			}
		}

	}

}