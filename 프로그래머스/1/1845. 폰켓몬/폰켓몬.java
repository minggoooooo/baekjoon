import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> phoneketmon = new HashSet<>();
        int max = nums.length/2;
        for(int i = 0 ; i < nums.length; i++){
            phoneketmon.add(nums[i]);
        }
        int result = phoneketmon.size();
        
        return (result > max) ? max : result;
    }
}