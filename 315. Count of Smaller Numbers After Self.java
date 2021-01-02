class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        int size = nums.length;
        int counter=0;
        int k = 0;
        
        for(int i=0;i<nums.length;i++)
        {
           
            for(int j =k; j<nums.length;j++)
            {
                if(nums[i]>nums[j]) counter++;
                
            }
            result.add(counter);
            counter=0;
            k++;
        }
     
        
        
        
        return result;
    }
}