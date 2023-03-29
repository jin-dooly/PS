import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        char[] arr = Integer.toString(n).toCharArray();
        for(char ch : arr){
            answer += ch - '0';
        }
        return answer;
    }
}