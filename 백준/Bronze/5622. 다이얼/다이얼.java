import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		//A~ Z 까지는 특정 숫자가 정해져있어
		// a에는 A~Z 까지 문자가 1~15개 입력 받을 수 있음
		// 각각 문자를 숫자로 바꿔치기 한다음 더하면 됨.
		// A~Z까지 26개 배열 만든다음 숫자 넣고

		int sum=0;
		for(int i=0; i<a.length();i++) {
			int b;
			switch(a.charAt(i)) {
			case 'A': 
			case 'B': 
			case 'C': b=3;
			break;
			case 'D': 
			case 'E': 
			case 'F': b=4;
			break;
			case 'G': 
			case 'H': 
			case 'I': b=5;
			break;
			case 'J': 
			case 'K': 
			case 'L': b=6;
			break;
			case 'M': 
			case 'N': 
			case 'O': b=7;
			break;
			case 'P': 
			case 'Q': 
			case 'R': 
			case 'S': b=8;
			break;
			case 'T': 
			case 'U': 
			case 'V': b=9;
			break;
			default : b=10;
			}
			sum+=b;
			}
		System.out.println(sum);
		}
}