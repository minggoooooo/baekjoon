
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(br.readLine());
		int N =Integer.parseInt(sc.nextToken());
		int M =Integer.parseInt(sc.nextToken());
		int[][]A=new int[N][M]; //첫번째 두번째 수를 입력받는 이차원행렬 생성
		int[][]B=new int[N][M]; //첫번째 두번째 수를 입력받는 이차원행렬 생성
		int[][]C=new int[N][M]; //두개 더한거 넣을 행렬 만듬
		for(int i=0; i<N; i++) {
			StringTokenizer sc1 = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
			A[i][j]=Integer.parseInt(sc1.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			StringTokenizer sc1 = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				B[i][j]=Integer.parseInt(sc1.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				C[i][j]=A[i][j]+B[i][j];
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}