import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double grade = 0;
		double score = 0;
		String[] arr = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
		double[] arr2 = { 4.5, 4.0, 3.5, 3, 2.5, 2, 1.5, 1, 0 };
		
		

		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			String str3 = st.nextToken();
			if (str3.equals("P")) {
				grade += 0;
				score += 0;
			} else if(str3.equals("A+")){
				grade += Double.parseDouble(str2);
				score += 4.5*Double.parseDouble(str2);
			}else if(str3.equals("A0")){
				grade += Double.parseDouble(str2);
				score += 4*Double.parseDouble(str2);
			}else if(str3.equals("B+")){
				grade += Double.parseDouble(str2);
				score += 3.5*Double.parseDouble(str2);
			}else if(str3.equals("B0")){
				grade += Double.parseDouble(str2);
				score += 3*Double.parseDouble(str2);
			}else if(str3.equals("C+")){
				grade += Double.parseDouble(str2);
				score += 2.5*Double.parseDouble(str2);
			}else if(str3.equals("C0")){
				grade += Double.parseDouble(str2);
				score += 2.0*Double.parseDouble(str2);
			}else if(str3.equals("D+")){
				grade += Double.parseDouble(str2);
				score += 1.5*Double.parseDouble(str2);
			}else if(str3.equals("D0")){
				grade += Double.parseDouble(str2);
				score += 1.0*Double.parseDouble(str2);
			}else if(str3.equals("F")){
				grade += Double.parseDouble(str2);
				score += 0;
			}

		}
		System.out.println(score/grade);

	}

}