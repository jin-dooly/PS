import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int len = topping.length;
        int[] left = new int[len];
        int[] right = new int[len];
        HashSet<Integer> lset = new HashSet<>();
        HashSet<Integer> rset = new HashSet<>();
        
        for(int i=1, j=len-1; i<len; i++, j--){
            lset.add(topping[i-1]);
            left[i] = lset.size();
            
            rset.add(topping[j]);
            right[j] = rset.size();
        }
        
        for(int i=1; i<len; i++){
            if(left[i] == right[i]) answer++;
        }
        return answer;
    }
}