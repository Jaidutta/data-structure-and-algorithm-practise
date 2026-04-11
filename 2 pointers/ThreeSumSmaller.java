import java.util.Arrays;

class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        // Your code goes here
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n-2; i++) {
            int left = i+ 1;
            int right = n -1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < target) {
                    count += (right - left);
                    left++;

                }
                else if(sum >= target) {
                    right--;
                }
                
            }
        }
        return count;
    }
}
