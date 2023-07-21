import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine()); // for문 횟수
		int count =0; // 약수카운터
		int targetnum = 0; // 갯수세는용
		
		StringTokenizer sc = new StringTokenizer(br.readLine());
		for(int i=0; i<num; i++) {
			count=0;
			int target = Integer.parseInt(sc.nextToken());
			for(int k=1; k<target; k++) {
				if(target%k==0) {
					count++;
				}
			}
		if(count ==1) {
			targetnum++; 
		}
		}
		System.out.println(targetnum);
	}

}