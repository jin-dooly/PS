import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int n) {
        Set<Integer> set = new HashSet<> ();
        set.add(2);
        for(int i=3; i<=n; i+=2){
            set.add(i);
        }
        if(n<9) return set.size();
        for(int i=3; i*i<n; i++){
            if(set.contains(i)){
                for(int j=i+i; j<=n; j+=i){
                    set.remove(j);
                }
            }
        }
        return set.size();
    }
}