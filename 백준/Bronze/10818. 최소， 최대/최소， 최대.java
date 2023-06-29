import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String strN = br.readLine(); 
		int N = Integer.parseInt(strN); //정수 N값을 정했음.
		String strM = br.readLine(); //strM이라는 새로운 문자열을 받아들임.
		StringTokenizer st = new StringTokenizer(strM); //문자열을 잘라줄거임. strM을 자를거야 띄어쓰기 기준으로 자름.
		; 
		int [] arr = new int[N]; // N값에 맞는 배열 생성
		for(int i=0; i<N; i++) { // N번 반복할거임
			arr[i]= Integer.parseInt(st.nextToken());// 
		}
		int max = arr[0];
		int min = arr[0];
		for(int j=1; j<N; j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
			if(arr[j]<min) {
				min=arr[j];
			}
			
		}
		System.out.println(min + " " + max);
	}
}