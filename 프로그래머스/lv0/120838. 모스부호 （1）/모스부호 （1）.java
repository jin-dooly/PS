
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] spl = letter.split(" ");
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
            ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
            ".--","-..-","-.--","--.."};
        for(String s:spl){
            for(int i=0; i<26; i++){
                if(s.equals(morse[i])){
                    answer += (char)(i+97);
                }
            }
        }
        return answer;
    }
}