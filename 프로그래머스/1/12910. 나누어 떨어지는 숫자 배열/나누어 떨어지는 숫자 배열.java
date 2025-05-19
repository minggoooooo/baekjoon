import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> al = new ArrayList();
        for ( int i : arr){
            if ( i % divisor == 0){
                al.add(i);
            }
        }
        if(al.size() == 0){
            al.add(-1);
        }
        
        Collections.sort(al);
        
        int[] answer = new int [al.size()];
        
        for(int i = 0; i< al.size(); i++){
            answer[i] = al.get(i);
        }
        return answer;
    }
}