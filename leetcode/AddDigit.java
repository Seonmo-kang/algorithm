class Solution {
    public int addDigits(int num) {
        int sum=0;
        String str = Integer.toString(num);
        for(int i=0;i<str.length();i++){
            int digit = str.charAt(i) - '0';
            sum+=digit;
        }
        if(sum>=10){
            return addDigits(sum);
        }
        return sum;
    }
}