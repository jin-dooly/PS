import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int xcnt = 0;
        int ycnt = 0;
        char[] str = s.toCharArray();
        char x = str[0];
        for(int i=0; i<str.length; i++){
            if(xcnt==0){
                x = str[i];
                xcnt++;
                continue;
            }else if(str[i]==x){
                xcnt++;
            }else{
                ycnt++;
            }
            if(xcnt == ycnt){
                answer++;
                xcnt = 0;
                ycnt = 0;
            }
        }
        if(xcnt!=0)
            answer++;
        
        return answer;
    }
}