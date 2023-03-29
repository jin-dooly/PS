class Solution {
    public String solution(String s) {
        String answer = "";
        int half = s.length()/2;
        char[] ch = s.toCharArray();
        answer = ch[half]+"";
        if(s.length()%2 == 0)
            answer = ch[half-1] + answer;
        return answer;
    }
}