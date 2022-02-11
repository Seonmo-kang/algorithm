class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        if(s1.length()>s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']-=1;
            freq[s2.charAt(i)-'a']+=1;
        }
        
        if(isAnagram(freq)){
            return true;
        }
        for(int j=0; j<s2.length()-s1.length(); j++){
            freq[s2.charAt(s1.length()+j)-'a']+=1;
            freq[s2.charAt(j)-'a']-=1;
            if(isAnagram(freq)){
                return true;
            }

        }
        return false;
        // s2 put in hashmap
        // s1[i] find
       
    }
    boolean isAnagram(int[] arr){
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=0){
                    return false;
                }   
            }
            return true;
        }
}