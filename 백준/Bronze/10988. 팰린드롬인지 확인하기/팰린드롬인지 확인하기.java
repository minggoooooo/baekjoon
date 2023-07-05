import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char[] arr = new char[str.length()]; // br.readline에 길이에 맞는 배열 만들기 char로 만들자

		
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[(arr.length - 1)-i] = str.charAt(i);
		} // 거꾸로 된 캐릭터 넣는 배열

		String str2 = String.valueOf(arr);
		

		

		if (str.equals(str2)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}