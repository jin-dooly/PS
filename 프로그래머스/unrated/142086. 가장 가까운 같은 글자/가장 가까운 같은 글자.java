import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] str = s.split("");
        int[] answer = new int[str.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<str.length; i++){
            answer[i] = map.get(str[i])==null? -1 : i - map.get(str[i]);
            map.put(str[i], i);
        }
        return answer;
    }
}