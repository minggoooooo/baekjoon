import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		int N= Integer.parseInt(st.nextToken());
		int[]arg=new int[N]; //N은 변수갯수
		for(int k=0; k<N; k++) {
			arg[k]=k+1;
		} // 0번바구니엔 1 1번바구니엔 2 2번바구니엔 3
		int M= Integer.parseInt(st.nextToken());
		int I;
		int J;
		int temp=0;
		for(int i=0; i<M; i++) {
			StringTokenizer sk = new StringTokenizer(bf.readLine()); 
			I = Integer.parseInt(sk.nextToken()); //3
			J = Integer.parseInt(sk.nextToken()); //5
		temp=arg[I-1];
		arg[I-1]=arg[J-1];
		arg[J-1]=temp;
		}
		for(int m=0; m<N; m++) {
			System.out.print(arg[m] + " ");
		}
	}
}