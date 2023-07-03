import java.io.*;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// a->97
		int[] alphabet = new int[26];
		for (int i = 0; i < 26; i++) {
			alphabet[i] = (97 + i);
		} // 캐릭터로 하던 어쩌던 일단 했고.

		String a = br.readLine(); // stream
		int[] x = new int[a.length()]; // 6글자

		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < a.length(); j++) {
				x[j] = a.charAt(j); // stream x[0] == 19
				if (x[j] == alphabet[i]) {
					alphabet[i] = j; // ex-> al[0] 4
				}

			}

		}
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] == (97 + i)) {
				alphabet[i] = -1;
			}
			System.out.print(alphabet[i] + " ");
		}

	}
}