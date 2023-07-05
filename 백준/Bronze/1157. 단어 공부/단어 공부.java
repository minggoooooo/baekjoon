import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int []arr = new int[str.length()];
		int[]arr2=new int [26];
		int []intarr= new int [26]; //소문자 97~122
		int []intarr2= new int [26]; //대문자 65~90
		for(int i=0; i<26; i++) {
			intarr[i]=97+i;
		}
		for(int i=0; i<26; i++) {
			intarr2[i]=65+i;
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int) str.charAt(i); //ex azZ -> 97 122 90 arr[0]97,arr[1]122,arr[2]90
		}
		//ex -> azZ a의개수는 1 z의개수는 2개 나머진 0개 이걸 구하는 방법은
		//26개짜리 배열을 만들고 a나A일때 카운트를 올려줘 'a''A'
		//일단 배열 생성 완료 
//		char a = 'z'; //a는 97 z는 122 A는 65 Z는 90
//		System.out.println((int)a);
		for(int i=0;i<arr.length; i++) { //i는 0,1,2
			for(int j=0; j<26; j++) {
				if(arr[i]==intarr[j]) {
					arr2[j]+=1;
				} else if(arr[i]==intarr2[j]) {
					arr2[j]+=1;
				} else {
					arr2[j]+=0;
				}
			}
		}
		//arr2라는 26개짜리 배열을 만들어서 같다면 +1을 계속 해줬어요 그러면 0부터 26까지 해당하는 숫자 즉 arr[0]은 1 , arr[25]는2 나머지는 0이됩니다.ㅣ
		
		int max=0;
		for(int i=0;i<26;i++) {
			if(arr2[i]>max) {
				max=arr2[i];
			}
		} //max=2가 되겠죠
		int x=0;
		int a=0;
		for(int i=0; i<26; i++) {
			if(arr2[i]==max) {
				a +=1;
				x =i+65;
			}
			
		}
		if(a!=1) {
			System.out.println("?");
		} else {
			System.out.println((char)x);	
		}
	}

}