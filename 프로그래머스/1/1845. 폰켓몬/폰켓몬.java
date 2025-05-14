import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int num = nums.length/2;

        Arrays.sort(nums);
        
        int target = nums[0];
        int answer = 1;
        for (int i = 1;i < nums.length; i++) {
            if (target != nums[i]){
                if(answer<num){
                     answer++;
                }
            }
            target = nums[i];
        }

        
        return answer;
    }
}