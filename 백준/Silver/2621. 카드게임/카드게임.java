import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] colors = new char[5];
        int [] numbers = new int[5];
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            colors[i] = st.nextToken().charAt(0);
            numbers[i]= Integer.parseInt(st.nextToken());
        }
        /* 플러시 */
        boolean flush = true;
        char color = colors[0];
        for(int i = 1; i< 5; i++){
            if (colors[i] != color) {
                flush = false;
                break;
            }
        }
        /* 스트레이트 */
        Arrays.sort(numbers);
        boolean straight = true;
        int num = numbers[0];
        for(int i= 1; i < 5; i++){
            num++;
            if(num!=numbers[i]){
                straight = false;
            }
        }
        /* 같은 수를 찾기위해*/
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();



        for (int number : numbers) {
            // 현재 숫자가 이미 맵에 있으면 빈도를 증가시키고, 없으면 1로 초기화
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        /* 투페어 이상 여부*/
        boolean pairs = pairs(frequencyMap);


        /*가장 큰 중복 된 개수*/
        int maxNumber = 0;
        for (int key : frequencyMap.keySet()) {
            if(maxNumber<frequencyMap.get(key)) {
                maxNumber = frequencyMap.get(key);
            }
        }
        int key1 = 0;
        /* 트리플 , 원페어*/
        if(!pairs) {
            for (int number : frequencyMap.keySet()) {
                if (frequencyMap.get(number) > 1) {
                    key1 = number;
                }
            }
        }
        int key2 = 0;
        /* 풀하우스 밑에는 투페어*/
        if(pairs && maxNumber==3){
            for (int number : frequencyMap.keySet()) {
                if (frequencyMap.get(number) == 3) {
                    key1 = number;
                } else {
                    key2 =number;
                }
            }
        } else if (pairs && maxNumber ==2) {
            boolean check = true;
            for (int number : frequencyMap.keySet()) {
                if(frequencyMap.get(number) ==2 && check){
                    key1 = number;
                    check = false;
                } else if (frequencyMap.get(number)==2) {
                    key2 = number;
                }
            }
            if(key1<key2){
                int temp = key1;
                key1 = key2;
                key2 = temp;
            }
        }

        System.out.println(pokers(straight,flush,numbers,maxNumber,pairs,key1,key2));

    }
    public static boolean pairs(HashMap<Integer, Integer> map){
        Collection<Integer> values = map.values();
        int count = 0;

        for(int num : values){
            if(num>=2){
                count ++;
            }
        }
        return count >=2;
    }

    public static Integer pokers(boolean straight, boolean flush, int[] nums, int maxNumber, boolean pairs, int key1 , int key2){
        if(straight && flush){
            return 900 + nums[4];
        } else if (maxNumber == 4){
            return 800 + key1;
        } else if (maxNumber == 3 && pairs) {
            return 700 + (10 * key1) + key2;
        } else if (flush) {
            return 600 + nums[4];
        } else if (straight) {
            return 500+ nums[4];
        } else if (maxNumber == 3) {
            return 400 + key1;
        } else if (maxNumber == 2 && pairs) {
            return 300 + (10 * key1) + key2;
        } else if (maxNumber == 2) {
            return 200 + key1;
        } else {
            return 100 + nums[4];
        }
    }
}
