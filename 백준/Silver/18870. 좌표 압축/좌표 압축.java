import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sc = new StringTokenizer(br.readLine());
        int targetNum = Integer.parseInt(sc.nextToken());
        int[] origin = new int[targetNum];  //기본
        int[] sorted = new int[targetNum];  //정렬할거
        HashMap<Integer,Integer> rankingMap = new HashMap<>();  //중복제거용 hashmap

        StringTokenizer sc2 = new StringTokenizer(br.readLine());
        for(int i=0; i<targetNum; i++){
            origin[i] = sorted[i] = Integer.parseInt(sc2.nextToken());
        }   //값 넣기
        Arrays.sort(sorted);    //정렬

        int rank = 0;       //value값으로 쓸 것

        for(int value : sorted){
            if(!rankingMap.containsKey(value)){
                rankingMap.put(value,rank);
                rank++;
            }
        }
        // 정렬해서 만약 같은 키를 가지고 있다면 패스 없다면 숫자 추가를 위해서 이렇게 함

        StringBuilder sb = new StringBuilder();
        for(int value : origin){
            sb.append(rankingMap.get(value)).append(" ");
        }
        sb.delete(sb.length()-1,sb.length());
        // 기존 원래 숫자를 가져와서 해쉬맵에서 키를 가지고 비교를 하면 거기에 값이 들어가 있으니 그 값을 넣기.
        System.out.println(sb);

    }
}