import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7,7};
        List<Integer> list = new ArrayList<> ();
        
        for(int i : win_nums){
            list.add(i);
        }
        
        for(int i=0; i<6; i++){
            if(lottos[i]==0){
                answer[0]--;
            }else if(list.contains(lottos[i])){
                answer[0]--;
                answer[1]--;
            }
        }
        
        if(answer[0]==7) answer[0]--;
        if(answer[1]==7) answer[1]--;
        
        return answer;
    }
}