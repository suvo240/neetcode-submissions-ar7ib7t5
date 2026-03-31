class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String newStr = sb.toString().toLowerCase();
        // String reversed = new StringBuilder(newStr).reverse().toString();
        // if(newStr.equals(reversed)){
        //     return true;
        // } else {
        //     return false;
        // }
        int start =0; int end = newStr.length()-1;
        while(end>start){
            if(newStr.charAt(start)!=newStr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
