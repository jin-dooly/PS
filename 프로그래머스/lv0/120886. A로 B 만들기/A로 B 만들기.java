import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] charA = before.toCharArray();
        char[] charB = after.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        before = new String(charA);
        after = new String(charB);
        int answer = after.equals(before)? 1 : 0 ;
        return answer;
    }
}