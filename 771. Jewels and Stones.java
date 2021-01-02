class Solution {
    public int numJewelsInStones(String J, String S) {
        int counter=0;
        for(int i=0;i<S.length();i++)
        {
            for(int j=0;j<J.length();j++)
            {
                 if(J.charAt(j) == S.charAt(i)){
                    counter ++;
                    break;
            }
         
         
         }
        
        
        
    }
        return counter;
    }
}