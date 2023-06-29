import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = 9;
		int c;
		int [] num = new int[a];
		for(int i=0; i<9; i++) {
			num[i] = sc.nextInt();
		}
		int max = num[0];
		for(int j=1; j<9; j++) {
			if(num[j]>max) {
				max= num[j];
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