import java.io.IOException;
import java.util.StringTokenizer;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M =Integer.parseInt(st.nextToken());
		int[]basket = new int[N+1]; //ex N에 5 M에 4를 준다고 가정합시다.
		for(int i=1; i<=N; i++) {
			basket[i]=i;
		} // basket[0] ->1 basket[1] ->2 basket[2] ->3 basket[3] ->4 basket[4] ->5
		//변수 줄 갯수 정하기
		int temp=0;
		for(int i=0; i<M; i++) {//4번 반복할게요
			StringTokenizer st1=new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st1.nextToken()); //4번 입력 받을거에요
			int J = Integer.parseInt(st1.nextToken());
			while(I<J) { //1 4 2일땐?
				temp = basket[I]; //temp는 1
				basket[I]= basket[J]; //I는 4
				basket[J]= temp; //j는 1이 됨
				I++; J--;
			}
			}
	
		for(int n=1; n<=N; n++) {
			System.out.print(basket[n]+" ");
		}
	}
}