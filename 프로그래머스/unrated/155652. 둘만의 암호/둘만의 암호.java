import java.util.Arrays;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer answer = new StringBuffer();
        char[] s_ch = s.toCharArray();
        char[] skip_ch = skip.toCharArray();
        Arrays.sort(skip_ch);
        for(char ch : s_ch){
            for(int i=0; i<index; i++){
                ch++;
                for(char sch : skip_ch){
                    if(sch == ch) ch++;
                }
                if(ch>'z'){
                    ch = (char)(ch-26);
                    for(char sch : skip_ch){
                        if(sch == ch) ch++;
                    }
                }
            }
            if(ch>'z') ch = (char)(ch-26);
            answer.append(ch);
        }
        return answer.toString();
    }
}