import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine()); // 정수를 받아와요
		int[] arr;
		String str;
		
		boolean[] arr2 = new boolean[123]; // 알파벳 소문자의 아스키코드는 97~122까지 26개
		//123까지 커버하기 위한 boolean을 만들어
		int count= 1; // 수를 세기위한 count추가
		int sum = 0;
		int result = 0;
		
		for (int i = 0; i < num; i++) { // 받아온 정수번만큼 for문 반복
			str = br.readLine(); // 문자열 받아오고 str로 집어넣기
			arr = new int[str.length()]; // 문자열길이만큼 배열 만들기
			for (int j = 0; j < str.length(); j++) {
				arr[j] = (int) str.charAt(j); // 배열에 해당하는 캐릭터 넣기.
				arr2[arr[j]]=false;
			}
			count = 1;
			arr2[arr[0]]=true; // 0번을 트루로 만들어 abab입니다. arr2[98]->true
				for (int j = 1; j< str.length(); j++) { //babb 
				count=1;
				if(arr[j]!=arr[j-1]) {
					if(arr2[arr[j]]==false) {
						count += 0;
					} else {
						count = 0;
						break;
					}
				} arr2[arr[j]]=true;
			}
			
			sum+=count;
		}
		System.out.println(sum);
	}

}
