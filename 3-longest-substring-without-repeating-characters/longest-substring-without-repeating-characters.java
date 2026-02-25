class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>() ;

        int j = 0 , i = 0 , n = s.length() ;
        int max_length = 0 ;
        while(j < n)
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j)) ;
                max_length = Math.max(j-i+1,max_length) ;
                j++ ;
            }
            else
            {
                set.remove(s.charAt(i)) ;
                i++ ;
            }
            
        }
        return max_length ;
    }
}