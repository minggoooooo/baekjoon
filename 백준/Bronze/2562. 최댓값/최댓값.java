import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x =9;
		int [] num = new int[x];
		for(int i = 0; i<9; i++) {
			num[i]=Integer.parseInt(bf.readLine());
		}
		int max=num[0];
		for(int j =1; j<9; j++) {
			if(num[j]>max) {
				max=num[j];
			}
		}
		System.out.print(max + " ");
		for(int k=0; k<9; k++) {
			if(num[k]==max) {
				System.out.println(k+1);
			}
		}
		
	}
}