public class Solution{
     public int lengthOfLongestSubstring(String str){

        
        int[] freq = new int[256];
        int max = 0;
        int start = 0;
        for(int end = 0;end<str.length();end++){
            char ch = str.charAt(end);
            freq[ch]++;

            while(freq[ch] > 1){
                freq[str.charAt(start)]--;
                start++;
            }
            int len = end - start + 1;
            if(len > max){
                max = len;
            }
        }
        return max;
    }
}