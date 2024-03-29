import java.util.*;

class Solution {
    public int dateToInt(String str){
        String[] ymd = str.split("[.]");
        int day = (Integer.parseInt(ymd[0])-2000)*12*28;
        day += Integer.parseInt(ymd[1])*28;
        day += Integer.parseInt(ymd[2]);
        return day;
    }
    
    
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        int td = dateToInt(today);
        int pd = 0;
        String[] tmp = new String[2];
        Map<String, Integer> term = new HashMap<>();
        
        for(String s : terms){
            tmp = s.split(" ");
            term.put(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        for(int i=0; i<privacies.length; i++){
            tmp = privacies[i].split(" ");
            pd = dateToInt(tmp[0]) + term.get(tmp[1])*28;
            if(pd <= td)  answer.add(i+1);
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}