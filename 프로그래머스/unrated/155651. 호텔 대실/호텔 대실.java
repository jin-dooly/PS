import java.util.ArrayList;
import java.util.PriorityQueue;

class Time implements Comparable<Time>{
    int in;
    int out;
    public Time(int in, int out){
        this.in = in;
        this.out = out;
    }

    @Override
    public int compareTo(Time o) {
        return in - o.in;
    }
}
class Solution {
    static PriorityQueue<Integer> room;
    static PriorityQueue<Time> schedule;
    
    static void func(Time scd){
        if(!room.isEmpty() && room.peek()+10 <= scd.in){
            room.poll();
        }
        room.add(scd.out);
    }
    
    public int solution(String[][] book_time) {
        int answer = 0;
        room = new PriorityQueue<>();
        schedule = new PriorityQueue<>();
        for(int i=0; i<book_time.length; i++){
            String[] in = book_time[i][0].split(":");
            String[] out = book_time[i][1].split(":");
            schedule.add(new Time(Integer.parseInt(in[0])*60 + Integer.parseInt(in[1]),Integer.parseInt(out[0])*60 + Integer.parseInt(out[1])));
        }
        while(!schedule.isEmpty()){
            func(schedule.poll());
        }
        return room.size();
    }
}