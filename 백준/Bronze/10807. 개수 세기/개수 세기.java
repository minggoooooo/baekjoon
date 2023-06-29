import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // a값 지정
		int [] arr = new int[a]; // a값에 맞는 배열 생성
		for(int i=0; i<a; i++) { // a번 반복할거임
			arr[i]=sc.nextInt(); //0번째부터 배열 내에 숫자 생성.
		}
		int b = sc.nextInt(); //b값을 새로 지정
		int c= 0; //c값이란걸 하나 만들어
		for(int k=0; k<a; k++) { //arr 안에는 내가 지정한 숫자들이 들어가있음 ex) a가 5고 두번째에 이걸 넣었음 3 3 2 1 3
			if(arr[k]==b) {
				c++;
			}
		}
		System.out.println(c);
	}
}