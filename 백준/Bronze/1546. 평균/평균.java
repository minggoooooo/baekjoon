import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double k = Double.parseDouble(st.nextToken());
		
		double [] num = new double[(int) k];
		//과목 개수 정하기 
		
		
		double max=0;
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0; i<k; i++) {
			num[i] =  Double.parseDouble(st1.nextToken());
			if(max<num[i]) {
				max=num[i];
			}
				//40 60 80 맥스가 80
		}
		double sum=0;
		//과목에 점수 정하기 + 최댓값 구하기
		for(int j=0; j<k; j++) {
			num[j]=(num[j]/max)*100;
			sum += num[j];
			//50, 75,80
		}
		double score = (double) sum/ num.length;
		System.out.println(score);


	}
}