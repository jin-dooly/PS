class Solution {
    public String solution(String s, int n) {
        StringBuffer answer = new StringBuffer();
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(c>='A' && c<='Z'){
                c = (char)((c+n-'A')%26 +'A');
            }else if(c>='a' && c<='z'){
                c = (char)((c+n-'a')%26 +'a');
            }
            answer.append(c);
        }
        return answer.toString();
    }
}