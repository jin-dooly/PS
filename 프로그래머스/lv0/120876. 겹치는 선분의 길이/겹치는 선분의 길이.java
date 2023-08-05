import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[][] lines) {
        Set<Integer> answer = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<3; i++){
            for(int j=lines[i][0]; j<lines[i][1]; j++){
                if(!set.add(j)){
                    answer.add(j);
                }
            }
        }
        return answer.size();
    }
}