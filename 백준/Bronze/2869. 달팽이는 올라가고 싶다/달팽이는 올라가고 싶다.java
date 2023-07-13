import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(bf.readLine());
		int up = Integer.parseInt(sc.nextToken()); //위
		int down = Integer.parseInt(sc.nextToken()); // 아래
		int legnth = Integer.parseInt(sc.nextToken()); // 막대길이
		
		 int total=  (legnth-up)/(up-down) ;
		 if((legnth-up)%(up-down)!=0) {
			 total+=2;
		 } else {
			 total+=1;
		 }
		
		
	
		System.out.println(total);
	}
}