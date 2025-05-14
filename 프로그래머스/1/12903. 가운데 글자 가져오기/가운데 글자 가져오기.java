class Solution {
    public String solution(String s) {
        boolean isodd = s.length()%2==1 ? true : false;
        
        String answer = "";
        int num = s.length()/2;
        
        if(isodd){
            answer = s.substring(num,num+1);
        } else {
            answer = s.substring(num-1,num+1);
        }
        return answer;
    }
}