class Solution {
    public void moveZeroes(int[] nums) {
    //    int left= 0;

    //    for(int right=0; right<nums.length; right++){
    //     if(nums[right]!=0){
    //       int temp = nums[left];
    //       nums[left] = nums[right];
    //       nums[right] = temp;
    //     left++;
    //     }
    //    }
       
     
int noz = 0;
int n = nums.length;

// Count zeroes
for (int ele : nums) {
    if (ele == 0) {
        noz++;
    }
}

// Move zeroes to the end
for (int j = 0; j < noz; j++) {
    for (int i = 0; i < n - 1 - j; i++) {
        if (nums[i] == 0) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }
}
    }
}