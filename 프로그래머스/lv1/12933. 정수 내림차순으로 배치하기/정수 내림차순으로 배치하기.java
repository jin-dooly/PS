import java.util.*;

class Solution {
    public long solution(long n) {
        String s = n+"";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        s = new StringBuffer(new String(ch)).reverse().toString();
        return Long.parseLong(s);
    }
}