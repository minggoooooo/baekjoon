import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count =0; // 약수카운터
		int targetnum = 0; // 갯수세는용
		
		
		
		int num1 = Integer.parseInt(br.readLine());//시작점
		int num2 = Integer.parseInt(br.readLine()); //끝점
		int min=num2;
		
		for(int i=num1; i<num2+1; i++) { // num1부터 num2까지 i에 대입할거에용
			count=0;
			for(int k=1; k<i; k++) {	//소수를 찾을게용
				if(i%k==0) {
					count++;
				}
			}
		if(count ==1) {
			targetnum += i;  //targetnum 에 소수의 합 min에 최솟값
			if(min>=i) {
				min=i;
			}
		}
		}
		if(targetnum!=0) {
		System.out.println(targetnum);
		System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}

}