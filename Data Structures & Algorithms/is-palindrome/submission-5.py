class Solution:
    def isPalindrome(self, s: str) -> bool:
        # chars = []
        # for ch in s:
        #     if ch.isalnum():
        #         chars.append(ch.lower())
        # new_str = ''.join(chars)
        
        # if(new_str == new_str[::-1]):
        #     return True
        # return False
        l = 0
        r = len(s)-1
        while l<r:
            if not s[l].isalnum():
                l +=1
            elif not s[r].isalnum():
                r -=1
            elif s[l].lower() != s[r].lower():
                return False
            else :
                l +=1
                r -=1
        return True