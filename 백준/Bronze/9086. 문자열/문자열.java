import java.io.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		String[] num = new String[a];
		for(int i=0; i<a; i++) {
			num[i]=br.readLine();
			int b= num[i].length();
			System.out.print(num[i].substring(0,1)+num[i].substring(b-1,b));
			System.out.println();
		}
		

	}
}