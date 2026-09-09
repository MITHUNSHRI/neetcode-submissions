class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) 
            return false;

        int[] counts = new int[26];   //int[] counts =new int[26];

        char[] sChars = s.toCharArray();
        
        for(int i=0; i < sChars.length; i++)
        {
            counts[sChars[i] - 'a']++;
        }

      char[] tchars=t.toCharArray();

        for(int i=0; i < tchars.length; i++)
        {
           counts[tchars[i] - 'a']--;
        }
for(int count :counts)

         if(count !=0)
         {
            return false;
         }
        

  return true;
    }
}
