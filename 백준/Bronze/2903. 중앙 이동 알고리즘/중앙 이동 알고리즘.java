
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b;
		b = 1 +(int) Math.pow(2, a);
		int result = (int) Math.pow(b, 2);
		System.out.println(result);
	}
}
