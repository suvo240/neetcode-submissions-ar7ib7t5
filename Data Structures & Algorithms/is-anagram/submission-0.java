class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        String ns = new String(charArrayS);
        String nt = new String(charArrayT);

        return ns.equals(nt);

    }
}
