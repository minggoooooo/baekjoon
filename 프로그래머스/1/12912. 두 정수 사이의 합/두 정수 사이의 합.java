class Solution {
    public long solution(int a, int b) {
        int temp = 0;
        if ( b < a){
            temp=b;
            b=a;
            a=temp;
        }
        long count = (long)(b - a + 1);
        
        return count * (b + (long)a) / 2;
    }
}