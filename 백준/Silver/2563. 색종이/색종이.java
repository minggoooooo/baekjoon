import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] B = new boolean[100][100];
		StringTokenizer sc= new StringTokenizer(br.readLine());
		int a = Integer.parseInt(sc.nextToken());
		int b = 0;
		int c = 0;
		int count= 0;
		
		for(int i=0; i<a; i++) {
			StringTokenizer sc1= new StringTokenizer(br.readLine());
			b= Integer.parseInt(sc1.nextToken());
			c= Integer.parseInt(sc1.nextToken());
		
		for(int k=b; k<b+10; k++) {
			for(int j=c; j<c+10; j++) {
				B[k][j]=true;
			}
		}
		
		}
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(B[i][j]==true) {
					count +=1;
				}
			}
		}
		
		System.out.println(count);


	}

}