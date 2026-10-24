class Solution {

    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // for(int i=0; i<n-1;i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[] {};
        int[] ans = {-1,-1};
    
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
               int j = map.get(rem);
               ans[0]=i;
               ans[1]=j;
               break;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}