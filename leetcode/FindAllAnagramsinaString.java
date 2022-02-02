import java.util.Arrays;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
//         char arr[] = p.toCharArray();
//         Arrays.sort(arr);
//         String p_sorted = new String(arr);
        
//         char temp[] = s.toCharArray();
//         List<Integer> list = new ArrayList<>();
//         int i=0;
//         while(i<s.length()-arr.length+1){
//             String rst = new String();
//             int num=0;
//             for(int j=i; j<arr.length+i; j++){
//                 rst+=temp[j];
//             }
//             char diff[] = rst.toCharArray();
//             Arrays.sort(diff);
//             String diff_sorted = new String(diff);
//             // System.out.println(diff_sorted);
//             // System.out.println("p_sorted"+p_sorted);
//             if(diff_sorted.equals(p_sorted)){
//                 list.add(i);
                
//             }
//             i++;
//         }
//         return list;
//     }
        int arr[] = new int[26];
        int arr2[] = new int[26];
        List<Integer> result = new ArrayList<>();
        
        if(s.length()*p.length()==0 || s.length()<p.length()){
            return result;
        }
        
        for(int i=0; i<p.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr,arr2)){
            result.add(0);
        }
        int start = 0;
        int end = p.length();
        while(end<s.length()){
            arr[s.charAt(start)-'a']--;
            arr[s.charAt(end)-'a']++;
            start++;
            end++;
            if(Arrays.equals(arr,arr2)){
                result.add(start);
            }
        }
        return result;
    }
}public class FindAllAnagramsinaString {
    
}
