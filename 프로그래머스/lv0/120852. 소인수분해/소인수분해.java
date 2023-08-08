import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        int[] answer = {};
        for(int i=2; i<=n; i++){
            while(n%i ==0){
                set.add(i);
                n/=i;
            }
        }
        answer = set.stream().mapToInt(Integer::intValue).toArray();;
        Arrays.sort(answer);
        return answer;
    }
}