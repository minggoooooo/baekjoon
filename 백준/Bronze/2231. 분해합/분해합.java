import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		//자연수가 주어진다.
		int first; // 첫째자리
		int second; // 둘째자리
		int third; //셋째자리
		int fourth; //넷째자리
		int fifth; //다섯째자리
		int sixth; //여섯째자리
		List <Integer> list = new ArrayList<>();
		// 이 자연수의 가장 작은 생성자를 찾아내기..
		// 117같은 경우는 108 117
		for(int i=0; i<num; i++) {
			for(int j=0; j<(int)(Math.log10(i)+1); j++) {
				if(i<10) {
					if(i+i==num) {
						list.add(i);
					}
				} else if(i<100) {
					first= i%10;
					second= i/10;
					if(i+first+second==num) {
						list.add(i);
					}
				} else if(i<1000) {
					first= i%10;
					second = (i/10)%10;
					third= (i/10)/10;
					if(i+first+second+third==num) {
						list.add(i);
					}
				} else if(i<10000) {
					first=i%10;
					second=(i/10)%10;
					third=(i/100)%10;
					fourth=i/1000;
					if(i+first+second+third+fourth==num) {
						list.add(i);
					}
				} else if(i<100000) {
					first=i%10;
					second=(i/10)%10;
					third=(i/100)%10;
					fourth=(i/1000)%10;
					fifth=i/10000;
					if(i+first+second+third+fourth+fifth==num) {
						list.add(i);
					}
				} else if(i<1000000) {
					first=i%10;
					second=(i/10)%10;
					third=(i/100)%10;
					fourth=(i/1000)%10;
					fifth=(i/10000)%10;
					sixth=i/100000;
					if(i+first+second+third+fourth+fifth+sixth==num) {
						list.add(i);
					}
				}
			}
		}
		int min;
		if(list.size()!=0) {
		min= list.get(0);
		} else {
			min=0;
		}
		System.out.println(min);
		
		
		
	}
}