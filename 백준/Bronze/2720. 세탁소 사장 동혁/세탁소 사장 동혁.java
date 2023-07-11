import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(bf.readLine()); // 테스트갯수
		int dollar = 0;
		for (int i = 0; i < s; i++) { // 테스트 횟수
			String st = bf.readLine();
			dollar = Integer.parseInt(st); // 테스트 객체
			boolean run = true;
			int Quater = 0;
			int Dime = 0;
			int Nickel = 0;
			int Penny = 0;
			while (run) {
				if (dollar >= 25) {
					Quater = dollar / 25;
					dollar %= 25;
					
				} else if (25 > dollar && dollar >= 10) {
					Dime = dollar / 10;
					dollar %= 10;

				} else if (10 > dollar && dollar >= 5) {
					Nickel = dollar / 5;
					dollar %= 5;

				} else if (5  >dollar && dollar >= 0) {
					Penny = dollar;
					run = false;
				}

			}
			System.out.printf("%d %d %d %d \n", Quater, Dime, Nickel, Penny);
		}

	}
}