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
		int M= Integer.parseInt(st.nextToken());//M은
		int I;
		int J;
		int K;
		for(int i=0; i<M; i++) {
			StringTokenizer sk = new StringTokenizer(bf.readLine()); 
			I = Integer.parseInt(sk.nextToken());
			J = Integer.parseInt(sk.nextToken());
			K= Integer.parseInt(sk.nextToken());
			for(int j=I; j<=J; j++) {
				arg[j-1] = K;
			}
		}
		for(int m=0; m<N; m++) {
			System.out.print(arg[m] + " ");
		}
	}
}