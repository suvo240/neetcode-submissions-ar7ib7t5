class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] charArrayS = s.toCharArray();
        // char[] charArrayT = t.toCharArray();
        // Arrays.sort(charArrayS);
        // Arrays.sort(charArrayT);

        // String ns = new String(charArrayS);
        // String nt = new String(charArrayT);

        // return ns.equals(nt);

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();

        for(int i=0;i<s.length();i++){
            mapS.put(s.charAt(i),mapS.getOrDefault(s.charAt(i),0)+1);
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }
        return mapS.equals(mapT);
    }
}
