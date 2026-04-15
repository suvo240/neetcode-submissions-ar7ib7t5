class Solution:
    def isValid(self, s: str) -> bool:
        strList = []
        if(len(s)==1):
            return False
        if(len(s)==0):
            return True

        for i in range(len(s)):
            if(s[i] == '(' or s[i] == '{' or s[i] == '['):
                strList.append(s[i])
            else:
                if (len(strList)==0):
                    return False
                ch = strList.pop()
                if((s[i] ==')' and ch != '(') or (s[i] =='}' and ch != '{') or
                s[i] ==']' and ch != '['):
                    return False
            
        return (len(strList)==0)
        