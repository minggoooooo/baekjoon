import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sum = 0;
		
		for(int i =0; i<y; i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a * b;
			sum += c;
		}
			if (sum==x) {
			System.out.println("Yes");
		}  else {
			System.out.println("No");
		}
		}
		
		
	}