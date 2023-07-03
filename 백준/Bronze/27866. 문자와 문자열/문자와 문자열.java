import java.io.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int i= Integer.parseInt(br.readLine());
		String str= a.substring((i-1),(i));
		
		System.out.println(str);

	}
}