import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "RCJA";
        int[] sum = new int[26];
        int[] score = {3,2,1,0,1,2,3};
        Arrays.fill(sum, 0);
        
        for(int i=0; i<survey.length; i++){
            if(choices[i]<4){
                sum[survey[i].charAt(0)-'A'] += score[choices[i]-1];
            }else if(choices[i]>4){
                sum[survey[i].charAt(1)-'A'] += score[choices[i]-1];
            }
        }
        
        if(sum['R'-'A'] < sum['T'-'A'])  answer = answer.replace("R","T");
        if(sum['C'-'A'] < sum['F'-'A'])  answer = answer.replace("C","F");
        if(sum['J'-'A'] < sum['M'-'A'])  answer = answer.replace("J","M");
        if(sum['A'-'A'] < sum['N'-'A'])  answer = answer.replace("A","N");
        
        return answer;
    }
}