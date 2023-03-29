import java.util.*;

class Mineral implements Comparable<Mineral> {
    int dia=0;
    int iron=0;
    int stone=0;

    @Override
    public int compareTo(Mineral o) {
        if(o.dia != dia){
            return o.dia - dia;
        }else{
            if(o.iron != iron){
                return o.iron - iron;
            }else{
                return o.stone - stone;
            }
        }
    }
}

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int useCnt = Math.min((int) Math.ceil(minerals.length/5.0), (picks[0]+picks[1]+picks[2]));
        PriorityQueue<Mineral> pq = new PriorityQueue<>();

        int idx = 0;
        for(int i=0; i<useCnt; i++){
            Mineral tmp = new Mineral();
            for(int j=0; j<5 && idx<minerals.length; j++){
                String mineral = minerals[idx++];
                if(mineral.equals("diamond")) tmp.dia++;
                else if(mineral.equals("iron")) tmp.iron++;
                else tmp.stone++;
            }
            pq.add(tmp);
        }

        for(int i=0; i<picks[0] && !pq.isEmpty(); i++){
            Mineral poll = pq.poll();
            answer += poll.dia + poll.iron + poll.stone;
        }
        for(int i=0; i<picks[1] && !pq.isEmpty(); i++){
            Mineral poll = pq.poll();
            answer += (poll.dia*5) + poll.iron + poll.stone;
        }
        for(int i=0; i<picks[2] && !pq.isEmpty(); i++){
            Mineral poll = pq.poll();
            answer += (poll.dia*25) + (poll.iron*5) + poll.stone;
        }

        return answer;
    }
}