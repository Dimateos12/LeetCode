class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      int[] odp = new int[2];
        
        for(int i =0; i<nums.length;i++)
        {
            for(int j=1; j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && j!=i) 
                {
                    odp[0]=i;
                    odp[1]=j;
                    
                
                }
            }
        }
        
        
      return odp;  
    }
}