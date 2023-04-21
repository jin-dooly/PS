import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        int len = truck_weights.length;
        Queue<Integer> cross = new LinkedList<>();
        cross.add(bridge_length);

        int out_idx = 0;
        int in_idx = 1;
        int bridge_weight = truck_weights[0];
        for(;!cross.isEmpty(); answer++){
            if(cross.peek()==answer){
                cross.poll();
                if(out_idx < len) bridge_weight -= truck_weights[out_idx++];
            }
            if(in_idx < len && bridge_weight + truck_weights[in_idx] <= weight){
                cross.add(bridge_length + answer);
                bridge_weight += truck_weights[in_idx++];
            }
        }
        return answer;
    }
}