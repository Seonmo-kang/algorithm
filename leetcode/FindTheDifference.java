import java.util.Map;

class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> hashmap = new HashMap<>();
        for( char s_char : s.toCharArray()){
            hashmap.put(s_char,hashmap.getOrDefault(s_char,0)+1);    
        }
        for( char t_char : t.toCharArray()){
            if( !(hashmap.containsKey(t_char)) || (hashmap.containsKey(t_char)&&hashmap.get(t_char)==0)){
                return t_char;
            }
            else{
                hashmap.put(t_char,hashmap.get(t_char)-1);
            }
        }
        return ' ';
        /* Using XOR operation <- It's more faster than above
        char c = 0;
        for(int i = 0; i < s.length(); i++){
            c ^= s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            c ^= t.charAt(i);
        }
        return c;
    }
}
        
         */
    }
}