import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();		//시행 횟수
		int target = sc.nextInt();		// 타겟넘버
		int sum = 0; 	// 합을 담고 타겟과 비교할 바구니
		int [] arr = new int[num];		//숫자 넣기.
		int max=0;	//최댓값
		List<Integer>targetarr=new ArrayList<>();	//3개 합 넣을 리스트 만들기
		for(int i=0; i<num; i++) {
			
		}
		
		int count = 0;
		
		
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				sum=0;		//초기화
				sum += arr[i];	//첫집을 넣어
				sum += arr[j];	//다음집을 넣어
				for(int k=i+2; k<arr.length; k++) {
					if(j<k) {
					sum += arr[k];	//다음집을 넣어
					targetarr.add(sum);
					sum -= arr[k];
					} 
				}
			}
		}
		for(int i=0; i<targetarr.size(); i++) {
			if(targetarr.get(i)<=target) {
				if(max<targetarr.get(i)) {
					max=targetarr.get(i);
				}
			}
		}
		System.out.println(max);
	}
}
