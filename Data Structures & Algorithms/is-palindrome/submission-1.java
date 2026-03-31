class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String newStr = sb.toString().toLowerCase();
        String reversed = new StringBuilder(newStr).reverse().toString();
        if(newStr.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }
}
