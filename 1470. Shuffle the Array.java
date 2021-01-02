class Solution {
    public int[] shuffle(int[] nums, int n) {
    
   int[] result = new int[2 * n];
        int i = 0;
        int j = n;
        int p = 0;
        while (i < n) 
        {
            result[p] = nums[i];
            p++;
            i++;
            result[p] = nums[j];
            p++;
            j++;
        }
        return result;
    }
}
   