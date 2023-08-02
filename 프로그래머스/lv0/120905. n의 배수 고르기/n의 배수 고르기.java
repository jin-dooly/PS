import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for(int i:numlist){
            if(i%n == 0) answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}