class Solution {
    public int minPairSum(int[] nums) {
    //   Arrays.sort(nums);
    //  int  maxpairsum =0;
    //   int left =0;
    //   int right = nums.length-1;

    //   while(left<right){
    //    int pairsum = nums[left] + nums[right]; 
    //    maxpairsum = Math.max(maxpairsum, pairsum);

    //    left++;
    //    right--;
    //   }  
    //   return maxpairsum;













     Arrays.sort(nums);
     int maxpairsum  = 0;
     int left = 0;
     int right = nums.length-1;

     while(left <= right){
    int pairsum = nums[left] + nums[right];

    maxpairsum = Math.max(maxpairsum , pairsum);

    left++;
    right--;
     } 
     return maxpairsum;
    }
}