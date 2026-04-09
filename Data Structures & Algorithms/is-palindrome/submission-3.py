class Solution:
    def isPalindrome(self, s: str) -> bool:
        chars = []
        for ch in s:
            if ch.isalnum():
                chars.append(ch.lower())
        new_str = ''.join(chars)
        
        if(new_str == new_str[::-1]):
            return True
        return False
        