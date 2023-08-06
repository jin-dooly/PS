import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        String spe = "";
        Arrays.sort(spell);
        spe = Arrays.stream(spell).collect(Collectors.joining(""));
        // for(String s:spell){
        //     spe += s;
        // }
        for(String d:dic){
            char[] ch = d.toCharArray();
            Arrays.sort(ch);
            d = new String(ch);
            if(d.indexOf(spe)!=-1){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}