import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int main = Integer.parseInt(st.nextToken());	//약수를 구할 메인숫자
		int num = Integer.parseInt(st.nextToken());		//몇번방에 들어갈건지 정할 숫자
		
		int count=0; //배열 생성하기 위한 숫자
		int[]arr = new int[main];
		for(int i=1; i<main+1; i++) {
			if(main%i==0) {
				count++;
			}
			if(count==num) {
				System.out.println(i);
				break;
			}
			if(main==i&&count!=num) {
				System.out.println(0);
			}
		}
	}

}
