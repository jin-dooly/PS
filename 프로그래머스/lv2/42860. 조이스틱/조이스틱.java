import java.util.Arrays;

class Solution {
    public int solution(String name) {
        int len = name.length();
        int alp = 0;
        int move = len-1;
        
        for(int i=0; i<len; i++){
            alp += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i)+1);
            
            if(i<len-1 && name.charAt(i+1)=='A'){
                int endA = i+1;
                while(endA<len && name.charAt(endA)=='A'){
                    endA++;
                }
                move = Math.min(move, i*2 + (len-endA));
                move = Math.min(move, (len-endA)*2 + i);
            }
        }
        System.out.println(alp+" "+move);
        return alp + move;
    }
}