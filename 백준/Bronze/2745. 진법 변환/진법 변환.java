import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc= new StringTokenizer(br.readLine());
		String a = sc.nextToken();	// 문자열 받아들이기
		int b = a.length(); //문자열 개수세기
		int c= Integer.parseInt(sc.nextToken()); //몇진법인지 설정하기
		int sum = 0;
		
		for(int i=0; i<b; i++) { // 5자리수라고 설정.
			if((int)a.charAt(i)<60) {
				int d= (int)a.charAt(i)-48;
				sum +=(int) Math.pow(c, b-1-i)*d;
			} else {
				int d=(int)a.charAt(i)-55;
				sum +=(int) Math.pow(c, b-1-i)*d;
			}
		}
		System.out.println(sum);

	}

}
