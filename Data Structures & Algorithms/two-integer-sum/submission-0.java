class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        for(int i =0; i< nums.length;i++){
            for(int y = i+1; y<nums.length;y++){
                if(nums[i]+nums[y]==target){
                    sol[0]=i;
                    sol[1]=y;
                    return sol;
                }

            }
        }
        return sol;
    }
}
