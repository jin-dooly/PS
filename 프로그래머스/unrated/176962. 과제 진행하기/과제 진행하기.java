import java.util.PriorityQueue;
import java.util.Stack;

class Hw implements Comparable<Hw>{
    String name;
    int start;
    int play;
    public Hw(String name, int start, int play){
        this.name = name;
        this.start = start;
        this.play = play;
    }

    @Override
    public int compareTo(Hw o) {
        return start - o.start;
    }
}
class Solution {
    static PriorityQueue<Hw> hws = new PriorityQueue<>();
    static Stack<Hw> rest = new Stack<>();
    static int idx = 0;
    static String[] answer;

    static void run(Hw now, int nextT){
        int doneT = now.start + now.play;
        //int nextT = hws.peek().start;
        if(doneT > nextT){
            now.play = doneT - nextT;
            rest.add(now);
        }else {
            answer[idx++] = now.name;
            if(doneT == nextT) {
                return;
            }else if(!rest.isEmpty()){
                now = rest.pop();
                now.start = doneT;
                run(now, nextT);
            }
        }
    }
    public String[] solution(String[][] plans) {
        answer = new String[plans.length];
        for(int i=0; i< plans.length; i++){
            String[] tmp = plans[i][1].split(":");
            int time = Integer.parseInt(tmp[0])*60 + Integer.parseInt(tmp[1]);
            hws.add(new Hw(plans[i][0], time, Integer.parseInt(plans[i][2])));
        }

        while(!hws.isEmpty()){
            Hw now = hws.poll();
            if(hws.isEmpty()){
                run(now, Integer.MAX_VALUE);
            }else{
                run(now, hws.peek().start);
            }
        }
        return answer;
    }
}