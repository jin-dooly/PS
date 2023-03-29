import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<> ();
        String[] keyarr;
        int value=0;
        for(String key : keymap){
            keyarr = key.split("");
            for(int i=0; i<keyarr.length; i++){
                if(map.get(keyarr[i])==null || map.get(keyarr[i])>i+1)
                    map.put(keyarr[i], i+1);
            }
        }
        for(int i=0; i<answer.length; i++){
            keyarr = targets[i].split("");
            for(int j=0; j<keyarr.length; j++){
                if(map.get(keyarr[j]) == null){
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += map.get(keyarr[j]);
                }
            }
        }
        return answer;
    }
}