import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int len = id_list.length;
        int[] answer = new int[len];
        int[] rep_cnt = new int[len];
        boolean[][] send = new boolean[len][len];
        Map<String, Integer> user = new HashMap<>();
        
        
        Arrays.fill(answer,0);
        Arrays.fill(rep_cnt, 0);
        for(int i=0; i<len; i++){
            Arrays.fill(send[i], false);
        }
        for(int i=0; i<len; i++){
            user.put(id_list[i], i);
        }
        
        
        for(int i=0; i<report.length; i++){
            String[] rep = report[i].split(" ");
            if(!send[user.get(rep[1])][user.get(rep[0])])  rep_cnt[user.get(rep[1])]++;
            send[user.get(rep[1])][user.get(rep[0])] = true;
        }
        
        
        for(int i=0; i<len; i++){
            if(rep_cnt[i]>=k){
                for(int j=0; j<len; j++){
                    if(send[i][j]){
                        answer[j]++;
                    }
                }
            }
        }
        return answer;
    }
}