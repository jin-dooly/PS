import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        for(int i=10; storey>0; storey/=10){
            int rest = storey%i;
            System.out.println(storey+", "+answer);
            if(rest>5) {
                storey += (i-rest);
                answer += (i-rest);
            }else if(rest<5){
                answer += rest;
            }else{
                if(storey/i>0 && storey/i%i >= 5) storey += 5;
                answer += 5;
            }
        }        
        return answer;
    }
}