import java.util.*;

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "", ch = "";
        List<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            ch = Character.toString(s.charAt(i));
            System.out.println("ch "+ch);
            if(answer.contains(ch)) {
                list.add(ch);
            }
            answer += ch;
        }
        Iterator<String> iterator = list.iterator();
 
        while (iterator.hasNext()) {
            answer = answer.replace(iterator.next(),"");
        } 
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        answer = String.valueOf(arr);
        return answer;
    }
}