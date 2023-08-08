import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        char ch;
        for(int i=0; i<my_string.length(); i++){
            ch = my_string.charAt(i);
            if(ch>47 && ch<58) list.add(ch-48);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}