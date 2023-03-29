import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Set<Integer> set = new HashSet<> ();
        Arrays.sort(lost);
        
        for(int i=0; i<reserve.length; i++){
            set.add(reserve[i]);
        }
        
        for(int i=0; i<lost.length; i++){
            if(set.contains(lost[i])){
                set.remove(lost[i]);
                lost[i] = -1;
                answer++;
            }
        }
        
        for(int i=0; i<lost.length && set.size()>0; i++){
            if(set.contains(lost[i]-1)){
                answer++;
                set.remove(lost[i]-1);
            }else if(set.contains(lost[i]+1)){
                answer++;
                set.remove(lost[i]+1);
            }
        }
        return answer;
    }
}