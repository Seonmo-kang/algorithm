class Solution {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                break;
            }else{
                digits[i]=0;
                if(i==0){
                    int[] newDigits = new int[digits.length+1];
                    newDigits[0]=1;
                    for(int j=1;j<digits.length;j++)
                        newDigits[j]=digits[j-1];
                    return newDigits;
                }
            }
        }
        return digits;

                // runtime error
        // StringBuilder sb = new StringBuilder();
        // for(int i:digits){
        //     sb.append(i);
        // }
        // int digits_int = Integer.parseInt(sb.toString())+1;
        // String digits_str = Integer.toString(digits_int);
        // int[] result = new int[digits_str.length()];
        // for(int i=0;i<digits_str.length();i++){
        //     result[i] = digits_str.charAt(i)-'0';
        //     }
        // return result;
    }
}