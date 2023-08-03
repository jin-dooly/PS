import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        Set<Character> set = new LinkedHashSet<Character>();
        for(int i=0; i<my_string.length(); i++){
            set.add(my_string.charAt(i));
        }
        Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			answer += it.next();
		}
        return answer;
    }
}