import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int b=Integer.parseInt(st.nextToken());
			String c =st.nextToken();
			for (int j = 0; j < c.length() ; j++) { // b가 반복횟수 b가 5라고하면 j가 0일때
				
				for (int k=0; k<b; k++) { //j는 0부터 4까지 0 1 2 3 4 | c.length가 4이야 5번
				
						System.out.print(c.charAt(j)); //첫번째 글자가 5번나와요 
					
				}
					
			}
            System.out.println();
		}

	}
}