import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean run = true;
		int [] arr ;
		while (run) {
			int count = 0;
			int count1 =0;
			int main = Integer.parseInt(br.readLine()); // 약수를 구할 메인숫자
			if(main == -1) {
				run = false;
				break;
			}
			arr = new int[main];
			for (int i = 1; i < main ; i++) {
				if(main%i==0) {
					arr[i-1]=i;
					count+= i ;
					count1 = i;
				}
			}
			if(count!=main) {
				System.out.println(main + " is NOT perfect.");
			} else {
				System.out.printf(main +" = ");
				for(int i=0; i<main; i++) {
					if(arr[i]!=0 && (i+1)!=count1) {
						System.out.printf(arr[i] + " + ");
					} else if(arr[i]!=0 && (i+1)==count1) {
						System.out.println(arr[i]);
					}
				}
			}
			
		}
	}

}